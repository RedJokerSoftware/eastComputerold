package br.com.east.eastComputer.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.east.eastComputer.models.cpu;

public interface CpuRepository extends CrudRepository<cpu, String>{
	
	//encontrar as cpus de um fabricante
	//Iterable<cpu>findByFabricante(cpu fabricante);
	

	cpu findByNome(String nome);
	cpu findByIdcpu(Long id);
	List <cpu>findBynome(String nome);

}
