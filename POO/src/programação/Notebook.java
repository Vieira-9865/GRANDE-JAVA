package programa��o;

public class Notebook {
	
	private int Identificador;
	private String Descri�ao;
	private String Marca;
	private String HD;
	private String Processador;
	private double Memoria;
	private double Pre�o;
	
	
	
	
	public Notebook(String Descri�ao, double pre�o) {
		this.setDescri�ao(Descri�ao);
		this.setPre�o(pre�o);
	}
	// Construtor vazio public + nome da classe
	public Notebook() {
		// TODO Auto-generated constructor stub
	}

	public int getIdentificador() {
		return Identificador;
	}
	public void setIdentificador(int identificador) {
		Identificador = identificador;
	}
	public String getDescri�ao() {
		return Descri�ao;
	}
	public void setDescri�ao(String descri�ao) {
		Descri�ao = descri�ao;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getHD() {
		return HD;
	}
	public void setHD(String hD) {
		HD = hD;
	}
	public String getProcessador() {
		return Processador;
	}
	public void setProcessador(String processador) {
		Processador = processador;
	}
	public double getMemoria() {
		return Memoria;
	}
	public void setMemoria(double memoria) {
		Memoria = memoria;
	}
	public double getPre�o() {
		return Pre�o;
	}
	public void setPre�o(double pre�o) {
		Pre�o = pre�o;
	}

}
