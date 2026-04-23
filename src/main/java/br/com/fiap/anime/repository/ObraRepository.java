package br.com.fiap.anime.repository;

import br.com.fiap.anime.model.Obra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObraRepository extends JpaRepository<Obra, Long> {
}