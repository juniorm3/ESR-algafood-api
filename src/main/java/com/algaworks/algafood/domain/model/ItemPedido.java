package com.algaworks.algafood.domain.model;

import java.math.BigDecimal;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class ItemPedido {

	private Long id;

	private Integer quantidade;

	private BigDecimal precoUnitario;

	private BigDecimal precoTotal;

	private Produto produto;
	
	private String observacao;

	private Pedido pedido;

}
