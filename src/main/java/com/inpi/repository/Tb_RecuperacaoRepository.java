package com.inpi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inpi.model.Tb_Recuperacao;

@Repository
public interface Tb_RecuperacaoRepository extends JpaRepository<Tb_Recuperacao, Long>{

}
