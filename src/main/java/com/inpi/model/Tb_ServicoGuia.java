package com.inpi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter  @Setter
@Entity(name = "tb_servicoguia")
public class Tb_ServicoGuia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "codservico", length = 30, nullable = false)
	private Long codServico;
	
	@Column(name = "numnossonumero", length = 30, nullable = false)
	private String numNossoNumero;
	
	@Column(name = "codnatureza", length = 30, nullable = false)
	private Long codNatureza;
}
