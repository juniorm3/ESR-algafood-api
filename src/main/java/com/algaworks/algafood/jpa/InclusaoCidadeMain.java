package com.algaworks.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cidade;
import com.algaworks.algafood.domain.model.Estado;
import com.algaworks.algafood.domain.repository.CidadeRepository;

public class InclusaoCidadeMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CidadeRepository cidades = applicationContext.getBean(CidadeRepository.class);
		
		Estado estado1 = new Estado();
		estado1.setId(1L);

		Estado estado2 = new Estado();
		estado2.setId(2L);

		Cidade cidade1 = new Cidade();
		cidade1.setNome("São José dos Campos");		
		cidade1.setEstado(estado1);
		
		Cidade cidade2 = new Cidade();
		cidade2.setNome("Jacareí");
		cidade2.setEstado(estado1);
		
		Cidade cidade3 = new Cidade();
		cidade3.setNome("Niterói");
		cidade3.setEstado(estado2);
		
		cidade1 = cidades.adicionar(cidade1);
		cidade2 = cidades.adicionar(cidade2);
		cidade3 = cidades.adicionar(cidade3);
		
		System.out.printf("%d - %s\n", cidade1.getId(), cidade1.getNome());
		System.out.printf("%d - %s\n", cidade2.getId(), cidade2.getNome());
		System.out.printf("%d - %s\n", cidade3.getId(), cidade3.getNome());
	}

}
