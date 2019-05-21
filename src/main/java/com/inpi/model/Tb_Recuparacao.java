package com.inpi.model;

import java.sql.Date;

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
@Getter @Setter
@Entity(name = "tb_recuparacao")
public class Tb_Recuparacao {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nu_gru", length = 30, nullable = false)
	private String nu_Gru;
	
	@Column(name = "codservico", length = 30, nullable = false)
	private Long codServico;
	
	@Column(name = "codcliente", length = 30, nullable = false)
	private Long codCliente;
	
	@Column(name = "datcadastro", nullable = false)
	private Date datCadastro;
	
	@Column(name = "nm_login", length = 30, nullable = false)
	private String nm_Login;	
	
}
