package com.algaworks.algafood.jpa;

import java.math.BigDecimal;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.RestauranteRepository;

public class InclusaoRestauranteMain {

	public static void main(String[] args) {

	ApplicationContext applicationContext	= new SpringApplicationBuilder(AlgafoodApiApplication.class)
			.web(WebApplicationType.NONE)
			.run(args);
	
	RestauranteRepository restaurantes = applicationContext.getBean(RestauranteRepository.class);
	
	Restaurante restaurante = new Restaurante();
	restaurante.setNome("Pintado na Brasa");
	restaurante.setTaxaFrete(new BigDecimal(30.0));
	
	Restaurante restaurante2 = new Restaurante();
	restaurante2.setNome("Churrascaria Romanni");
	restaurante2.setTaxaFrete(new BigDecimal(50.0));
	
	restaurante = restaurantes.adicionar(restaurante);
	restaurante2 = restaurantes.adicionar(restaurante2);
	
	System.out.printf("%d - %s - %.2f\n", restaurante.getId(), restaurante.getNome(), restaurante.getTaxaFrete());
	System.out.printf("%d - %s - %.2f\n", restaurante2.getId(), restaurante2.getNome(), restaurante2.getTaxaFrete());
	
	}

}
