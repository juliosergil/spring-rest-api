package com.inpi.model;

import java.io.Serializable;
import java.util.Date;

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
@Entity(name = "tb_docpagamento")
public class Tb_DocPagamento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	
	@Column(name = "numnossonumero", length = 30, nullable = false)
	private String numNossoNumero;
	
	@Column(name = "codcliente", length = 30, nullable = false)
	private Long codCliente;
	
	@Column(name = "datcadastro", nullable = false)
	private Date datCadastro;
	
	@Column(name = "nm_login", length = 30, nullable = false)
	private String nm_Login;
	
	@Column(name = "dh_recuperacao", nullable = false)
	private Date dh_Recuperacao;	
	
}
