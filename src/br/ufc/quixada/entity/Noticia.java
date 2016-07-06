package br.ufc.quixada.entity;

import java.util.Calendar;

public class Noticia {

	private int id;
	private String titulo;
	private String subtitulo;
	private String texto;
	private int id_autor;
	private Calendar data_noticia;
	private int id_secao;
	
	public Noticia(int id, String titulo, String subtitulo, String texto,
			int id_autor, Calendar data_noticia, int id_secao) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.subtitulo = subtitulo;
		this.texto = texto;
		this.id_autor = id_autor;
		this.data_noticia = data_noticia;
		this.id_secao = id_secao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSubtitulo() {
		return subtitulo;
	}

	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getId_autor() {
		return id_autor;
	}

	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}

	public Calendar getData_noticia() {
		return data_noticia;
	}

	public void setData_noticia(Calendar data_noticia) {
		this.data_noticia = data_noticia;
	}

	public int getId_secao() {
		return id_secao;
	}

	public void setId_secao(int id_secao) {
		this.id_secao = id_secao;
	}
		
}
