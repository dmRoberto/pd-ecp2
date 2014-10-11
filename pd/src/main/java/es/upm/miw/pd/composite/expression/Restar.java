package es.upm.miw.pd.composite.expression;

public class Restar extends Operation {

	public Restar(Expresion expresion1, Expresion expresion2) {
		super(expresion1, expresion2);
	}

	@Override
	public int operar() {
		return this.expresions[0].operar() - this.expresions[1].operar();
	}

	@Override
	public String toString() {
		return "("+this.expresions[0].toString()+"-"+this.expresions[1].toString()+")";
	}


}
