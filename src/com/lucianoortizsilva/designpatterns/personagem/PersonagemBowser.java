package com.lucianoortizsilva.designpatterns.personagem;

import com.lucianoortizsilva.designpatterns.ataque.AtaqueCascoVerde;
import com.lucianoortizsilva.designpatterns.strategy.Strategy;

public class PersonagemBowser extends Strategy {

	public PersonagemBowser() {
		this.ataque = new AtaqueCascoVerde();
	}

	@Override
	public void nome() {
		System.out.println("Olá, eu sou o Bowser");
	}

}
