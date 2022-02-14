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
public class produto implements Serializable  {
	private static final long serrialVersionUID=1L;
	
	//https://www.youtube.com/watch?v=-LvhAAUnVj0&list=PLvtOeOw_Op8k8p6vw-ADaHcKavUnZaGk8&index=6
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long id;
	@NotEmpty
	private long idcpu;
	@NotEmpty
	private long idplacamae;
	
	@NotEmpty
	private long idram;
	
	private long idgpu;
	@NotEmpty
	private int estoque;
	
	private String foto;
	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	@ManyToOne
	pedido pedido;
	
	//@OneToMany(mappedBy="produtos", cascade= CascadeType.REMOVE)
	//private List<periferico> idperiferico;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdcpu() {
		return idcpu;
	}

	public void setIdcpu(long idcpu) {
		this.idcpu = idcpu;
	}

	public long getIdplacamae() {
		return idplacamae;
	}

	public void setIdplacamae(long idplacamae) {
		this.idplacamae = idplacamae;
	}

	public long getIdram() {
		return idram;
	}

	public void setIdram(long idram) {
		this.idram = idram;
	}

	public long getIdgpu() {
		return idgpu;
	}

	public void setIdgpu(long idgpu) {
		this.idgpu = idgpu;
	}
	
	//public List<periferico> getIdperiferico() {
	//	return idperiferico;
	//}

	public void setProdutos(List<periferico> idperiferico) {
		//this.idperiferico = idperiferico;
	}

	public pedido getPedido() {
		return pedido;
	}

	public void setPedido(pedido pedido) {
		this.pedido = pedido;
	}
		
	
}
