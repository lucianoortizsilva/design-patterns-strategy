package com.lucianoortizsilva.designpatterns.ataque;

public class AtaqueInexistente implements Ataque {

	@Override
	public void atacar() {
		System.out.println("N�o posso atacar, estou sem b�nus");
	}
}
