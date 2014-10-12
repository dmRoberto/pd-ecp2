package es.upm.miw.pd.factoryMethod.naturalNumber;

import java.util.Arrays;

public class NaturalNumberFr extends NaturalNumber {

	public NaturalNumberFr() {
		super();
	}

	public NaturalNumberFr(int value) {
		super(value);
	}

	@Override
	protected void initIdioma() {
		textValue = Arrays.asList("zero", "un", "deux", "trois", "quatre",
				"cinq").toArray(new String[6]);
	}
}
