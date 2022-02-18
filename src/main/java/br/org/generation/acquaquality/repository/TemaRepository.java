package br.org.generation.acquaquality.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.acquaquality.model.Tema;

@Repository

public interface TemaRepository extends JpaRepository<Tema, Long> {
	List<Tema> findAllByCategoriaPostagemContainingIgnoreCase(String categoriaPostagem);

}
