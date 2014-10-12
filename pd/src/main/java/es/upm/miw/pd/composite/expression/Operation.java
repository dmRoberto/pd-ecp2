package es.upm.miw.pd.composite.expression;

public abstract class Operation extends Expresion {

	protected Expresion[] expresions = new Expresion[2];

	public Operation(Expresion expresion1, Expresion expresion2) {
		this.expresions[0] = expresion1;
		this.expresions[1] = expresion2;
	}

}
