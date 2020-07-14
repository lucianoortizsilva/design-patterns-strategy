package com.lucianoortizsilva.designpatterns.personagem;

import com.lucianoortizsilva.designpatterns.ataque.AtaqueInexistente;
import com.lucianoortizsilva.designpatterns.defesa.DefesaInexistente;
import com.lucianoortizsilva.designpatterns.strategy.Strategy;

public class PersonagemYoshi extends Strategy {

	public PersonagemYoshi() {
		this.ataque = new AtaqueInexistente();
		this.defesa = new DefesaInexistente();
	}

	@Override
	public void nome() {
		System.out.println("Olá, eu sou o Yoshi");
	}

}