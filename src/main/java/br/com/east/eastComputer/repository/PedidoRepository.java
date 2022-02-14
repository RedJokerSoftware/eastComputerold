package br.com.east.eastComputer.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import br.com.east.eastComputer.models.pedido;
import br.com.east.eastComputer.models.produto;

public interface PedidoRepository extends CrudRepository<pedido, String>  {
//	pedido findByIdpedido(long idpedido);
	//List <pedido> findById(long id);

	
	
//	Iterable<pedido>findByProduto(produto produto);

//	pedido findByCPF(String cpf);
	//pedido findById(Long id);
//	List <pedido>findByIdlist(Long id);
}
