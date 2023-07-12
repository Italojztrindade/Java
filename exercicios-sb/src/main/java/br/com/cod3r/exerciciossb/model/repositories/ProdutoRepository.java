package br.com.cod3r.exerciciossb.model.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.cod3r.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{
	
//por convenção, existem certos padrões onde o spring consegue realizar consultas já pré definidas que não exigem implementar
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
//findByNomeContaining
//	findByNomeIsContaining
//	findByNomeContains
//	
//	findByNomeStartsWith
//	findByNomeEndsWith
//	
//	findByNomeNotContaining
	
	@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
	public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
}
