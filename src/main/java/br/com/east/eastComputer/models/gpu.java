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
public class gpu implements Serializable  {
	
	private static final long serrialVersionUID=1L;
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long idgpu;
	
	@NotEmpty
	private String fabricante;
	@NotEmpty
	private String nome;
	@NotEmpty
	private int qtdvram;
	@NotEmpty
	private String tiposlot;
	
	private String conectorenergia;
	@NotEmpty
	private String tipovram;
	@NotEmpty
	private String foto;
	
	private String sitereferencia;
	@NotEmpty
	private Float preco;
	@NotEmpty
	private int estoque;
	
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public long getIdgpu() {
		return idgpu;
	}
	public void setIdgpu(long idgpu) {
		this.idgpu = idgpu;
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
	public int getQtdvram() {
		return qtdvram;
	}
	public void setQtdvram(int qtdvram) {
		this.qtdvram = qtdvram;
	}
	public String getTiposlot() {
		return tiposlot;
	}
	public void setTiposlot(String tiposlot) {
		this.tiposlot = tiposlot;
	}
	public String getConectorenergia() {
		return conectorenergia;
	}
	public void setConectorenergia(String conectorenergia) {
		this.conectorenergia = conectorenergia;
	}
	public String getTipovram() {
		return tipovram;
	}
	public void setTipovram(String tipovram) {
		this.tipovram = tipovram;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getSitereferencia() {
		return sitereferencia;
	}
	public void setSitereferencia(String sitereferencia) {
		this.sitereferencia = sitereferencia;
	}
	public Float getPreco() {
		return preco;
	}
	public void setPreco(Float preco) {
		this.preco = preco;
	}
	
	
}
