package com.lucianoortizsilva.designpatterns.defesa;

public class DefesaInexistente implements Defesa {

	@Override
	public void defender() {
		System.out.println("N�o posso defender, estou sem b�nus");
	}

}