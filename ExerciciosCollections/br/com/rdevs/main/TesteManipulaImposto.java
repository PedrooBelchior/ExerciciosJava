package br.com.rdevs.main;

import br.com.rdevs.contas.ManipuladorDeTributaveis;
import br.com.rdevs.model.ContaCorrente;
import br.com.rdevs.model.SeguroDeVida;
import br.com.rdevs.model.Tributavel;

public class TesteManipulaImposto {

	public static void main(String[] args) {
		ContaCorrente corrente = new ContaCorrente("Pedro");
		corrente.depositar(100000);
		
		SeguroDeVida seguro = new SeguroDeVida();
		seguro.setNumeroApolice(2601);
		seguro.setTitular("Pedro");
		seguro.setValor(1000);
		
		Tributavel tributavel[] = {corrente, seguro};
		ManipuladorDeTributaveis manipulador = new ManipuladorDeTributaveis();
		System.out.println(manipulador.calculaImpostos(tributavel));
	}

}
