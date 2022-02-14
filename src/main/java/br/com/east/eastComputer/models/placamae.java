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
public class placamae implements Serializable  {
	private static final long serrialVersionUID=1L;
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long idplacamae;
	@NotEmpty
	private String fabricante;
	@NotEmpty
	private String modelo;
	@NotEmpty
	private String numeroserie;
	@NotEmpty
	private String chipset;
	@NotEmpty
	private String tiporam;
	@NotEmpty
	private int qtdslots;
	@NotEmpty
	private String conectores;
	@NotEmpty
	private String formatoplaca;
	@NotEmpty
	private String tipofonte;

	private String foto;
	@NotEmpty
	private float preco;
	@NotEmpty
	private String socket;
	@NotEmpty
	private int estoque;
	
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public long getIdplacamae() {
		return idplacamae;
	}
	public void setIdplacamae(long idplacamae) {
		this.idplacamae = idplacamae;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getNumeroserie() {
		return numeroserie;
	}
	public void setNumeroserie(String numeroserie) {
		this.numeroserie = numeroserie;
	}
	public String getChipset() {
		return chipset;
	}
	public void setChipset(String chipset) {
		this.chipset = chipset;
	}
	public String getTiporam() {
		return tiporam;
	}
	public void setTiporam(String tiporam) {
		this.tiporam = tiporam;
	}
	public int getQtdslots() {
		return qtdslots;
	}
	public void setQtdslots(int qtdslots) {
		this.qtdslots = qtdslots;
	}
	public String getConectores() {
		return conectores;
	}
	public void setConectores(String conectores) {
		this.conectores = conectores;
	}
	public String getFormatoplaca() {
		return formatoplaca;
	}
	public void setFormatoplaca(String formatoplaca) {
		this.formatoplaca = formatoplaca;
	}
	public String getTipofonte() {
		return tipofonte;
	}
	public void setTipofonte(String tipofonte) {
		this.tipofonte = tipofonte;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public String getSocket() {
		return socket;
	}
	public void setSocket(String socket) {
		this.socket = socket;
	}
	
}
