package com.lucianoortizsilva.designpatterns.defesa;

public class DefesaInexistente implements Defesa {

	@Override
	public void defender() {
		System.out.println("Não posso defender, estou sem bônus");
	}

}