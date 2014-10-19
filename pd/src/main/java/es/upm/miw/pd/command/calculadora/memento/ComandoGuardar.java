package es.upm.miw.pd.command.calculadora.memento;

import upm.jbb.IO;
import es.upm.miw.pd.command.calculadora.Calculadora;

public class ComandoGuardar extends ComandoAbstractoMemento {

	public ComandoGuardar(Calculadora calc,
			GestorMementos<MementoCalculadora> gestorMemento) {
		super(calc, gestorMemento);
		name = "guardar";
	}

	@Override
	public void execute() {
		this.gestorMemento.addMemento(IO.in.readString("Nombre del Memento"),
				((CalculadoraMementable) this.calculadora).createMemento());
	}

}
