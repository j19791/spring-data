package br.com.alura.spring.data.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //sinalizamos q essa classe é uma entidade
@Table(name = "cargos") //muda comportamentos da tabela criada no bd
public class Cargo {

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE) //cria os ids sequenciamente, automaticamente
	private Integer id;
	private String descricao;
	
}
