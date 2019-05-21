package com.inpi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inpi.model.Tb_ServicoGuia;

@Repository
public interface Tb_ServicoGuiaRepository extends JpaRepository<Tb_ServicoGuia, Long>{
	
	//Tb_ServicoGuia findByNumNossoNumero(String numnossonumero);

}
