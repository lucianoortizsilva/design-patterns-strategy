package com.lucianoortizsilva.designpatterns.personagem;

import com.lucianoortizsilva.designpatterns.ataque.AtaqueInexistente;
import com.lucianoortizsilva.designpatterns.defesa.DefesaInexistente;
import com.lucianoortizsilva.designpatterns.strategy.Strategy;

public class PersonagemMario extends Strategy {

	public PersonagemMario() {
		this.ataque = new AtaqueInexistente();
		this.defesa = new DefesaInexistente();
	}

	@Override
	public void nome() {
		System.out.println("Ol�, eu sou o Mario");
	}

}