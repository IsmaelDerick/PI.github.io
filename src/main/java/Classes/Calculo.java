package Classes;

import java.io.Serializable;

public class Calculo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private float da;
	private float i ;
	private int n ;
	private float valor_contabil;
	private int vi  ;
	private int tempoDeUso ;
	private int velho ;
	private int turnos ;
	private float valores ;
	private String data2;
	private String data3;
	private float custo ;
	private float valor_residual ;
	private float gp;
	
	public Calculo() {
		super();
	}

	public Calculo(float da, float i, int n, float valor_contabil, float valores, String data2, String data3, int velho, int turnos, int vi, int tempoDeUso, float custo, float valor_residual,float gp) {
		super();
		this.da = da;
		this.valor_residual = valor_residual;
		this.velho = velho;
		this.turnos = turnos;
		this.vi = vi;
		this.tempoDeUso = tempoDeUso;
		this.i = i;
		this.n = n;
		this.valor_contabil = valor_contabil;
		this.valores = valores ;
		this.data2 = data2;
		this.data3 = data3;
		this.custo = custo;
		this.gp = gp;
		
	}	
	
	public float getValor_contabil() {
		return valor_contabil;
	}

	public void setValor_contabil(float valor_contabil) {
		this.valor_contabil = valor_contabil;
	}

	


	public float getValores() {
		return valores;
	}

	public void setValores(float valores) {
		this.valores = valores;
	}

	public String getData2() {
		return data2;
	}

	public void setData2(String data2) {
		this.data2 = data2;
	}

	public float getDa() {
		return da;
	}

	public void setDa(float da) {
		this.da = da;
	}

	public float getI() {
		return i;
	}

	public void setI(float i) {
		this.i = i;
	}

	

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public String getData3() {
		return data3;
	}

	public void setData3(String data3) {
		this.data3 = data3;
	}

	public int getVi() {
		return vi;
	}

	public void setVi(int vi) {
		this.vi = vi;
	}

	public int getTempoDeUso() {
		return tempoDeUso;
	}

	public void setTempoDeUso(int tempoDeUso) {
		this.tempoDeUso = tempoDeUso;
	}

	public int getVelho() {
		return velho;
	}

	public void setVelho(int velho) {
		this.velho = velho;
	}

	public int getTurnos() {
		return turnos;
	}

	public void setTurnos(int turnos) {
		this.turnos = turnos;
	}

	public float getCusto() {
		return custo;
	}

	public void setCusto(float custo) {
		this.custo = custo;
	}

	public float getValor_residual() {
		return valor_residual;
	}

	public void setValor_residual(float valor_residual) {
		this.valor_residual = valor_residual;
	}

	public float getGp() {
		return gp;
	}

	public void setGp(float gp) {
		this.gp = gp;
	}
	
}
