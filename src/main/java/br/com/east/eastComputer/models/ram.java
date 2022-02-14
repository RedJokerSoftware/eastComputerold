package br.com.east.eastComputer.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class ram implements Serializable {
	private static final long serrialVersionUID=1L;
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long idram;
	
	@NotEmpty
	private String fabricante;
	@NotEmpty
	private String tiporam;
	@NotEmpty
	private String frequencia;
	@NotEmpty
	private String tamanhoram;
	
	private String foto;
	
	private String descricao;
	
	@NotEmpty
	private float preco;
	@NotEmpty
	private int estoque;
	
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public long getIdram() {
		return idram;
	}

	public void setIdram(long idram) {
		this.idram = idram;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getTiporam() {
		return tiporam;
	}

	public void setTiporam(String tiporam) {
		this.tiporam = tiporam;
	}

	public String getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}

	public String getTamanhoram() {
		return tamanhoram;
	}

	public void setTamanhoram(String tamanhoram) {
		this.tamanhoram = tamanhoram;
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
