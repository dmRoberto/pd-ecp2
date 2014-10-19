package es.upm.miw.pd.command.calculadora;

import upm.jbb.IO;

public class ComandoSumar extends ComandoAbstracto {

	public ComandoSumar(Calculadora calc) {
		super(calc);
		name = "sumar";
	}

	@Override
	public void execute() {
		int valor = IO.in.readInt("Introduzca el valor a sumar: ");
		this.calculadora.sumar(valor);
	}

}
