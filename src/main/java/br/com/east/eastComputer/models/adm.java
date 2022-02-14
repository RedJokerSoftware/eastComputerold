package br.com.east.eastComputer.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class adm implements Serializable {
	
	private static final long serrialVersionUID=1L;
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long id;
	
	@NotEmpty
	private String nome;
	@NotEmpty
	private String senha;
	@NotEmpty
	private String dica;
	@NotEmpty
	private int niveladm;
	//0 apenas editar produtos
	//1 editar clientes
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getDica() {
		return dica;
	}
	public void setDica(String dica) {
		this.dica = dica;
	}
	public int getNiveladm() {
		return niveladm;
	}
	public void setNiveladm(int niveladm) {
		this.niveladm = niveladm;
	}
	
	
	
}
