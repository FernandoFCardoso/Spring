package br.org.generation.blogpessoal.model;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //Cria uma entidade ex: Entidade tb_postagem, um precisa do outro
@Table(name = "tb_postagens")
public class Postagem {
	
	@Id //Serve para falar que o atributo é chave = primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY ) // indica o auto incremento (strategy) indentity indica sequencia numerica
	private long id; // declaração, long = int; seria tipo o bigint
	
	@NotNull(message = "O atributo título é obrigatório!")// se fizer um texto sem nada aparece isso
	@Size(min = 5 , max = 100, message = "O atributo título deve conter no mínimo 5 e no máximo 100!")
	private String titulo; //size = tamanho
	@NotNull(message = "O atributo título é obrigatório!")
	@Size(min = 10 , max = 1000, message = "O atributo título deve conter no mínimo 10 e no máximo 1000!")
	private String texto;
	
	@Temporal(TemporalType.TIMESTAMP) // é como se fosse o date, avisa ao receber a data
	private Date data = new java.sql.Date(System.currentTimeMillis()); // esse java.sql.Date já puxa do sistema a data.
	
	
	@ManyToOne 
	@JsonIgnoreProperties("postagem") 
	private Tema tema;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public long getId() {
		return id; 
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Tema getTema() {
		return tema;
	}
	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
}
