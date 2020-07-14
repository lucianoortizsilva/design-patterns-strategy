package com.lucianoortizsilva.designpatterns.strategy;

import com.lucianoortizsilva.designpatterns.ataque.Ataque;
import com.lucianoortizsilva.designpatterns.defesa.Defesa;

public abstract class Strategy {

	protected Ataque ataque;
	protected Defesa defesa;

	public abstract void nome();

	public void atacar() {
		this.ataque.atacar();
	}

	public void defender() {
		this.defesa.defender();
	}

	public void setAtacar(final Ataque ataque) {
		this.ataque = ataque;
	}

	public void setDefender(final Defesa defesa) {
		this.defesa = defesa;
	}

}