package es.upm.miw.pd.command.calculadora.memento;

public class MementoCalculadora {

	private int total;

	public MementoCalculadora(int total) {
		this.total = total;
	}

	public int getValor() {
		return total;
	}
}
