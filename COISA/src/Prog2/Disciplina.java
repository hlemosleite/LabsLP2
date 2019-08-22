package Prog2;

import java.util.Arrays;

public class Disciplina {
	private String nomeDisciplina;
	private int horaEstudo;
	private double[] notas;
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.notas = new double [4];
	}
	
	public void cadastraHoras(int horas) {
		horaEstudo = horas;
	}
	public void cadastraNota(int nota, double valorNota) {
		// notas possíveis: 1, 2, 3 e 4
		notas[nota-1] = valorNota;
	}
	private double media() {
		int soma = 0;
		for (int m = 0; m < notas.length; m++) {
			soma += notas[m];
		}
		double media = soma / notas.length;
		return media;
	}
	public boolean aprovado() {
		return media() >= 7.0;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public int getHoraEstudo() {
		return horaEstudo;
	}
	public double[] getNotas() {
		return notas;
	}

	public String notasToString() {
		return Arrays.toString(notas);
	}
	public String toString() {
		return nomeDisciplina + " " + horaEstudo + " " + media() + notasToString();
	}
	
}
