package br.com.ricardo.baccarini.minhacarteira.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ricardo.baccarini.minhacarteira.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
