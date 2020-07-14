package com.lucianoortizsilva.designpatterns.personagem;

import com.lucianoortizsilva.designpatterns.ataque.AtaqueCascoVerde;
import com.lucianoortizsilva.designpatterns.strategy.Strategy;

public class PersonagemMario extends Strategy {

	public PersonagemMario() {
		this.ataque = new AtaqueCascoVerde();
	}

	@Override
	public void nome() {
		System.out.println("Ol�, eu sou o Mario");
	}

}