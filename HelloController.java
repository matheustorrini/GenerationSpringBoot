package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping 
	public String helloWorld() {
		return "Hello, World!";
	
		
	}
	
	@GetMapping("/bsm")
	public String bsm() {
	
		return "PT - BSM-0 - Introdução às Habilidades Comportamentais e Mentalidades <br />"
				+ "PT - BSM-GM - Mentalidade de Crescimento <br />"
				+ "PT - BSM-P - Persistência <br />"
				+ "PT - BSM-PR - Responsabilidade Pessoal <br />"
				+ "PT - BSM-FO - Orientação ao Futuro <br />"
				+ "PT - BSM-C - Comunicação <br />"
				+ "PT - BSM-OD - Orientação ao Detalhe <br />"
				+ "PT - BSM-PA - Proatividade <br />"
				+ "PT - BSM-T - Trabalho em Equipe <br />"
				+ "PT - C-GG - Dar e Receber <br />"
				+ "PT - SA-CS1 - Estudo de Caso 1: Força de Trabalho Distribuída <br />"
				+ "PT - SA-CS2 - Estudo de Caso 2: Entregável Urgente <br />"
				+ "PT - SA-CS3 - Estudo de Caso 3: Novas Habilidades Necessárias <br />"
				+ "PT - SA-CS4 - Estudo de Caso 4: Aprender e Compartilhar <br />"
				+ "PT - SSM-TM - Gestão do Tempo <br />"
				+ "PT - SSM-IV - Introdução à VIA e a Descoberta das Forças de Caráter VIA <br />"
				+ "PT - SSM-RLW - Maximizar a Aprendizagem Online e o Trabalho Remoto";}

	
	

	
	
	
	@GetMapping("/learn")
	public String learn()
	{
	
		
		return "Participar das aulas com intensidade e foco. Separar um tempo para estudar com "
				+ "efeitivade mas cuidando da saúde mental";
	}}
