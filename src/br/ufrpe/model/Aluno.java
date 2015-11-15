package br.ufrpe.model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private String cpf;
	private String nomeEstudante;
	private String sexo;
	private String tipoIngresso;
	private String periodoIngresso;
	private String turno;
	private String argmClassf;
	private List<Periodo> periodos;

	public Aluno() {
		this.periodos = new ArrayList<Periodo>();
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeEstudante() {
		return nomeEstudante;
	}

	public void setNomeEstudante(String nomeEstudante) {
		this.nomeEstudante = nomeEstudante;
	}

	public String getTipoIngresso() {
		return tipoIngresso;
	}

	public void setTipoIngresso(String tipoIngresso) {
		this.tipoIngresso = tipoIngresso;
	}

	public String getPeriodoIngresso() {
		return periodoIngresso;
	}

	public void setPeriodoIngresso(String periodoIngresso) {
		this.periodoIngresso = periodoIngresso;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getArgmClassf() {
		return argmClassf;
	}

	public void setArgmClassf(String argmClassf) {
		this.argmClassf = argmClassf;
	}

	public void adicionarPeriodo(Periodo periodo) {
		this.periodos.add(periodo);
	}
}
