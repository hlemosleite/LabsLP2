package Prog2;

public class ContaLaboratorio {
	private String nomeLaboratorio;
	private int espaco;
	private int cota;
	
	public ContaLaboratorio(String nomeLaboratorio) {
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = 2000;
	}
	
	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		super();
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = cota;
	}
	
	public void consomeEspaco(int mbytes) {
		espaco += mbytes;
	}
	public void liberaEspaco(int mbytes) {
		espaco -= mbytes;
	}
	public boolean atingiuCota() {
		if (espaco >= cota) {
			return true;
		}
		return false;
	}
	
	public int getEspaco() {
		return espaco;
	}
	public int getCota() {
		return cota;
	}
	public String getNomeLaboratorio() {
		return nomeLaboratorio;

	}

	public String toString() {
		return nomeLaboratorio + " " + espaco + "/" + cota;
	}
}

	
