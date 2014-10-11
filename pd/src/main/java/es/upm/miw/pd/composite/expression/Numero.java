package es.upm.miw.pd.composite.expression;

public class Numero extends Expresion {

	private Integer valor;

	public Numero(int numero) {
		this.valor = numero;
	}

	@Override
	public int operar() {
		return this.valor;
	}

	@Override
	public String toString() {
		return String.valueOf(valor);
	}

}
