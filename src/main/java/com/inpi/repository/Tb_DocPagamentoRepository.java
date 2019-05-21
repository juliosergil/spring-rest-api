package com.inpi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inpi.model.Tb_DocPagamento;

@Repository
public interface Tb_DocPagamentoRepository extends JpaRepository<Tb_DocPagamento, Long> {
	
	 Tb_DocPagamento findByNumNossoNumero(String numnossonumero);

}
