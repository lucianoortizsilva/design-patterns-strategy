package com.lucianoortizsilva.designpatterns;

import com.lucianoortizsilva.designpatterns.ataque.Ataque;
import com.lucianoortizsilva.designpatterns.ataque.AtaqueBanana;
import com.lucianoortizsilva.designpatterns.ataque.AtaqueCascoVerde;
import com.lucianoortizsilva.designpatterns.ataque.AtaqueCascoVermelho;
import com.lucianoortizsilva.designpatterns.defesa.Defesa;
import com.lucianoortizsilva.designpatterns.defesa.DefesaBanana;
import com.lucianoortizsilva.designpatterns.defesa.DefesaCascoVerde;
import com.lucianoortizsilva.designpatterns.defesa.DefesaCascoVermelho;
import com.lucianoortizsilva.designpatterns.personagem.PersonagemBowser;
import com.lucianoortizsilva.designpatterns.personagem.PersonagemMario;
import com.lucianoortizsilva.designpatterns.personagem.PersonagemYoshi;
import com.lucianoortizsilva.designpatterns.strategy.Strategy;

public class Main {

	public static void main(String[] args) {

		final Ataque[] ataques = {new AtaqueBanana(), new AtaqueCascoVermelho(), new AtaqueCascoVerde()};
		final Defesa [] defesas = {new DefesaCascoVermelho(), new DefesaCascoVerde(), new DefesaBanana()};
		final Strategy[] personagens = {new PersonagemYoshi(), new PersonagemMario(), new PersonagemBowser()};
		
		
		
		final Strategy personagem = personagens[(int) (Math.random() * 3)];
		personagem.nome();
		personagem.atacar();
		personagem.defender();
		personagem.setAtacar(ataques[(int) (Math.random() * 3)]);
		personagem.setDefender(defesas[(int) (Math.random() * 3)]);
		personagem.atacar();
		personagem.defender();
	}

}