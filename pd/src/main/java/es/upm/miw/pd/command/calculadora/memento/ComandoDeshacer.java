package es.upm.miw.pd.command.calculadora.memento;

import upm.jbb.IO;
import es.upm.miw.pd.command.calculadora.Calculadora;

public class ComandoDeshacer extends ComandoAbstractoMemento {

	public ComandoDeshacer(Calculadora calc,
			GestorMementos<MementoCalculadora> gestorMemento) {
		super(calc, gestorMemento);
		name = "deshacer";
	}

	@Override
	public void execute() {
		String retorePoint = (String) IO.in.select(this.gestorMemento.keys(),
				"Seleccione el punto de restauracion");
		((CalculadoraMementable) this.calculadora)
				.restoreMemento(this.gestorMemento.getMemento(retorePoint));
	}
}
