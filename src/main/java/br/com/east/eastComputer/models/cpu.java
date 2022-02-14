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
public class cpu implements Serializable {
	private static final long serrialVersionUID=1L;
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long idcpu;
	
	@NotEmpty
	private String socket;
	@NotEmpty
	private String fabricante;
	@NotEmpty
	private String nome;
	@NotEmpty
	private String frequencia;
	@NotEmpty
	private String turbo;
	@NotEmpty
	private String chipsets;
	
	private int qtdnucleos;
	@NotEmpty
	private String tiporam;
	
	private String sitereferencia;
	
	private float preco;
	
	private int estoque;
	
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public long getIdcpu() {
		return idcpu;
	}
	public void setIdcpu(long idcpu) {
		this.idcpu = idcpu;
	}
	public String getSocket() {
		return socket;
	}
	public void setSocket(String socket) {
		this.socket = socket;
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
	public String getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}
	public String getTurbo() {
		return turbo;
	}
	public void setTurbo(String turbo) {
		this.turbo = turbo;
	}
	public String getChipsets() {
		return chipsets;
	}
	public void setChipsets(String chipsets) {
		this.chipsets = chipsets;
	}
	public int getQtdnucleos() {
		return qtdnucleos;
	}
	public void setQtdnucleos(int qtdnucleos) {
		this.qtdnucleos = qtdnucleos;
	}
	public String getTiporam() {
		return tiporam;
	}
	public void setTiporam(String tiporam) {
		this.tiporam = tiporam;
	}
	public String getSitereferencia() {
		return sitereferencia;
	}
	public void setSitereferencia(String sitereferencia) {
		this.sitereferencia = sitereferencia;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
}
