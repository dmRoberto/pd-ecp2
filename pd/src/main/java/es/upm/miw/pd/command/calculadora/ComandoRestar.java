package es.upm.miw.pd.command.calculadora;

import upm.jbb.IO;

public class ComandoRestar extends ComandoAbstracto {

	public ComandoRestar(Calculadora calc) {
		super(calc);
		name = "restar";
	}
	@Override
	public void execute() {
		int valor = IO.in.readInt("Introduzca el valor a restar: ");
		this.receptor.restar(valor);
	}

}
