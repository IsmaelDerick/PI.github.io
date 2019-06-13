package Classes;

import java.io.Serializable;


public class Bem implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome_bem;
	private float custo;
	private String data_aquisicao;
	private String uso;
	private int tempo_uso;
	private int turnos;
	private int vida_util;
	private float valor_residual;
	private String venda;
	private String data_venda;
	private float valor_venda;
	private float da;
	private float i ;
	private int n ;
	private float valor_contabil;	
	
	public int getTempo_uso() {
		return tempo_uso;
	}

	public void setTempo_uso(int anos_usado) {
		this.tempo_uso = anos_usado;
	}

	


	public int getVida_util() {
		return vida_util;
	}

	public void setVida_util(int vida) {
		this.vida_util = vida;
	}

	public float getValor_residual() {
		return valor_residual;
	}

	public void setValor_residual(float vr) {
		this.valor_residual = vr;
	}

	public String getVenda() {
		return venda;
	}

	public void setVenda(String vendido) {
		this.venda = vendido;
	}


	public float getValor_venda() {
		return valor_venda;
	}

	public void setValor_venda(float valor_vd) {
		this.valor_venda = valor_vd;
	}

	public Bem() {
		super();
	}

	public Bem(Long id, String nome_bem, Float custo, String data_aquisicao, String uso, int turnos, int vida_util,
                float valor_residual, String venda, String data_venda, float valor_venda,float da,float i ,int n , float valor_contabil) {
		super();
		this.id = id;
		this.nome_bem = nome_bem;
		this.custo = custo;
		this.data_aquisicao = data_aquisicao;
		this.uso = uso ;
		this.turnos = turnos;
		this.vida_util = vida_util;
		this.valor_residual = valor_residual;
		this.venda = venda;
		this.data_venda = data_venda;
		this.valor_venda = valor_venda;
		this.da = da;
		this.i = i;
		this.n = n;
		this.valor_contabil = valor_contabil;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_bem() {
		return nome_bem;
	}

	public void setNome_bem(String nome) {
		this.nome_bem = nome;
	}

	public float getCusto() {
		return custo;
	}

	public void setCusto(float cb) {
		this.custo = cb;
	}



	public String getUso() {
		return uso;
	}

	public void setUso(String usado) {
		this.uso = usado;
	}

	public int getTurnos() {
		return turnos;
	}

	public void setTurnos(int turno) {
		this.turnos = turno;
	}

	

	public String getData_aquisicao() {
		return data_aquisicao;
	}

	public void setData_aquisicao(String data_aq) {
		this.data_aquisicao = data_aq;
	}

	public String getData_venda() {
		return data_venda;
	}

	public void setData_venda(String data_vd) {
		this.data_venda = data_vd;
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

	public float getValor_contabil() {
		return valor_contabil;
	}

	public void setValor_contabil(float valor_contabil) {
		this.valor_contabil = valor_contabil;
	}
	


	

}