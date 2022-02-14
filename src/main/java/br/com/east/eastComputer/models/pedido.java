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
public class pedido implements Serializable  {
	private static final long serrialVersionUID=1L;
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long idpedido;
	
	@NotEmpty
	private long cpf;
	
	
	
//	@OneToMany(mappedBy="produto", cascade= CascadeType.REMOVE)
//	private List<produto> produtos;


	public long getIdpedido() {
		return idpedido;
	}


	public void setIdpedido(long idpedido) {
		this.idpedido = idpedido;
	}


	public long getCpf() {
		return cpf;
	}


	public void setCpf(long cpf) {
		this.cpf = cpf;
	}


	//public List<produto> getProdutos() {
		//return produtos;
	//}


	public void setProdutos(List<produto> produtos) {
		//this.produtos = produtos;
	}
	
	
	
	
}
