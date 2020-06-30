package com.algaworks.algafood.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Pedido {

	private Long id;
	
	private BigDecimal subTotal;

	private BigDecimal valorTotal;

	private LocalDateTime dataCriacao;

	private LocalDateTime dataConfirmacao;

	private LocalDateTime dataCancelamento;

	private LocalDateTime dataEntrega;

	private List<ItemPedido> itensPedido = new ArrayList<>();
	
	private Restaurante restaurante;
	
	private FormaPagamento formaPagamento;
	
	private Usuario cliente;
	
	@Embedded
	private Endereco enderecoEntrega;
	
	private StatusPedido status;
	
	
}
