package es.upm.miw.pd.command.calculadora.memento;

import es.upm.miw.pd.command.calculadora.Calculadora;
import es.upm.miw.pd.command.calculadora.ComandoAbstracto;

public abstract class ComandoAbstractoMemento extends ComandoAbstracto {

	protected GestorMementos<MementoCalculadora> gestorMemento;

	public ComandoAbstractoMemento(Calculadora cal,
			GestorMementos<MementoCalculadora> gestorMemento) {
		super(cal);
		this.gestorMemento = gestorMemento;
	}

}
