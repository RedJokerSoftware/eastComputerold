package br.com.east.eastComputer.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import br.com.east.eastComputer.models.pedido;
import br.com.east.eastComputer.models.produto;

public interface ProdutoRepository extends CrudRepository<produto, String>  {
	//Iterable<produto>findByPedido(pedido pedido);

	produto findByNome(String nome);
	produto findById(Long id);
	List <produto>findBynome(String nomeProduto);
	
	
	
}
