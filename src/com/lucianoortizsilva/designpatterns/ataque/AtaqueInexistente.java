package com.lucianoortizsilva.designpatterns.ataque;

public class AtaqueInexistente implements Ataque {

	@Override
	public void atacar() {
		System.out.println("Não posso atacar, estou sem bônus");
	}
}
