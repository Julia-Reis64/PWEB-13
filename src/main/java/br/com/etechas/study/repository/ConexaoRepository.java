package br.com.etechas.study.repository;

import br.com.etechas.study.entity.Conexao;
import org.hibernate.mapping.Selectable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConexaoRepository extends JpaRepository<Conexao, Long> {

}
