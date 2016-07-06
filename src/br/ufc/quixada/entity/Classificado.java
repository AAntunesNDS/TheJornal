package br.ufc.quixada.entity;

import java.util.Calendar;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "classificados")
public class Classificado {

	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotNull
	private String titutlo;
	@NotNull
	private String texto;
	@NotNull
	private float preco;
	@NotNull
	private String telefone;
	@NotNull
	private float melhor_oferta;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data_oferta;
	
	@Column(name="usuario", insertable=false, updatable=false, nullable=false)
	private int id_autor;
	
	
	public Classificado(int id, String titutlo, String texto, float preco,String telefone, float melhor_oferta, Calendar data_oferta, int id_autor) {
		super();
		this.id = id;
		this.titutlo = titutlo;
		this.texto = texto;
		this.preco = preco;
		this.telefone = telefone;
		this.melhor_oferta = melhor_oferta;
		this.data_oferta = data_oferta;
		this.id_autor = id_autor;
	}
		
	public Classificado() {
		super();
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitutlo() {
		return titutlo;
	}

	public void setTitutlo(String titutlo) {
		this.titutlo = titutlo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public float getMelhor_oferta() {
		return melhor_oferta;
	}

	public void setMelhor_oferta(float melhor_oferta) {
		this.melhor_oferta = melhor_oferta;
	}

	public Calendar getData_oferta() {
		return data_oferta;
	}

	public void setData_oferta(Calendar data_oferta) {
		this.data_oferta = data_oferta;
	}

	public int getId_autor() {
		return id_autor;
	}

	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}
		
}
