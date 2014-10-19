package es.upm.miw.pd.command.calculadora;

import upm.jbb.IO;

public class ComandoImprimir extends ComandoAbstracto {

	public ComandoImprimir(Calculadora calc) {
		super(calc);
		name = "imprimir";
	}

	@Override
	public void execute() {
		IO.in.print("Total: " + calculadora.getTotal());
		IO.in.println();
	}

}
