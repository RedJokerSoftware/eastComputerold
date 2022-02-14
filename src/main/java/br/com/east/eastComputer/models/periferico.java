package br.com.east.eastComputer.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class periferico implements Serializable  {
	private static final long serrialVersionUID=1L;
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long idperiferico;
	
	@NotEmpty
	private String fabricante;
	@NotEmpty
	private String nome;
	@NotEmpty
	private String tipoperiferico;
	
	private String foto;
	
	private String descricao;
	@NotEmpty
	private float preco;
	
	
	@ManyToOne
	produto produto;
	@NotEmpty
	private int estoque;
	
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public produto getProduto() {
		return produto;
	}
	public void setProduto(produto produto) {
		this.produto = produto;
	}
	public long getIdperiferico() {
		return idperiferico;
	}
	public void setIdperiferico(long idperiferico) {
		this.idperiferico = idperiferico;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoperiferico() {
		return tipoperiferico;
	}
	public void setTipoperiferico(String tipoperiferico) {
		this.tipoperiferico = tipoperiferico;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
}
