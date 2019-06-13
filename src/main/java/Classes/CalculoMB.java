package Classes;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;



@ManagedBean(name = "calculoMB")
@RequestScoped

public class CalculoMB implements Serializable {
	private static final long serialVersionUID = 1L;
	private Calculo calculo = new Calculo();
	
	public String depreciacaoPeriodo() {
		
		
		int depreciacaoPeriodo = 0;
		int diaAquisicao = Integer.parseInt(calculo.getData3().substring(0, 2));
		int mesAquisicao = Integer.parseInt(calculo.getData3().substring(3, 5));
		int anoAquisicao = Integer.parseInt(calculo.getData3().substring(6));
		int diaAtual = Integer.parseInt(calculo.getData2().substring(0, 2));
		int mesAtual = Integer.parseInt(calculo.getData2().substring(3, 5));
		int anoAtual = Integer.parseInt(calculo.getData2().substring(6));
		float taxa = 0;
		float vc ;
		float da ;
		float vl_re;
		
		if (anoAtual - anoAquisicao == 0) {
			depreciacaoPeriodo = depreciacaoPeriodo + (mesAtual - mesAquisicao) + 1;
		} else {
			if (anoAtual - anoAquisicao >= 2) {
				depreciacaoPeriodo = (anoAtual - anoAquisicao - 1) * 12;
				depreciacaoPeriodo = depreciacaoPeriodo + (12 - mesAquisicao);
				depreciacaoPeriodo = depreciacaoPeriodo + mesAtual;
			} else {
				depreciacaoPeriodo = depreciacaoPeriodo + (12 - mesAquisicao);
				depreciacaoPeriodo = depreciacaoPeriodo + mesAtual;
			}
		}
		if (diaAquisicao > 15) {
			depreciacaoPeriodo--;
		} 
		if (diaAtual < 15) {
			depreciacaoPeriodo--;
		}
		if (calculo.getVelho() == 1) {
			if ((calculo.getVi() / 2) > (calculo.getVi() - calculo.getTempoDeUso())) {
				taxa = 100 / (calculo.getVi() / 2);
			} else {
				taxa = 100 / (calculo.getVi() - calculo.getTempoDeUso());
			}
		} else {
			taxa = 100 / calculo.getVi();
		}
		taxa = taxa / 100;
		if (calculo.getTurnos() == 3) {
			taxa = taxa * 2;
		}
		if (calculo.getTurnos() == 2) {
			taxa = (float) (taxa * 1.5);
		}
		if (calculo.getTurnos() == 1) {
			taxa = taxa * 1;
		}
		vl_re = calculo.getCusto() * (calculo.getValor_residual()/100);
		da = (((calculo.getCusto() - vl_re) * taxa) / 12) * depreciacaoPeriodo;
		vc = (calculo.getCusto()-da);
		
		calculo.setValores(vl_re);
		calculo.setN(depreciacaoPeriodo);
		calculo.setI(taxa);
		calculo.setDa(da);
		calculo.setValor_contabil(vc);
		
		
		return "Depreciacao";
	}

	

	
	
	public Calculo getCalculo() {
		return calculo;
	}

	public void setCalculo(Calculo calculo) {
		this.calculo = calculo;
	}

}
