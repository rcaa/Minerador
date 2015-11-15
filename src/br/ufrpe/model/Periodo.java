package br.ufrpe.model;

import java.util.ArrayList;
import java.util.List;

public class Periodo {

	private String semestre;
	private String media;
	private List<Disciplina> disciplinas;

	public Periodo() {
		this.disciplinas = new ArrayList<Disciplina>();
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public void adicionarDisciplina(Disciplina disc) {
		this.disciplinas.add(disc);
	}

}