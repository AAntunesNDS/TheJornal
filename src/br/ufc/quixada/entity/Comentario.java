package br.ufc.quixada.entity;

public class Comentario {

	private int id;
	private int id_noticia;
	private int id_autor;
	private String texto;
	
	public Comentario(int id, int id_noticia, int id_autor, String texto) {
		super();
		this.id = id;
		this.id_noticia = id_noticia;
		this.id_autor = id_autor;
		this.texto = texto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_noticia() {
		return id_noticia;
	}

	public void setId_noticia(int id_noticia) {
		this.id_noticia = id_noticia;
	}

	public int getId_autor() {
		return id_autor;
	}

	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
