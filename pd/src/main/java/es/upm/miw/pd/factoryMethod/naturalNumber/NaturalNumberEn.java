package es.upm.miw.pd.factoryMethod.naturalNumber;

import java.util.Arrays;

public class NaturalNumberEn extends NaturalNumber {
	
	public NaturalNumberEn() {
		super();
	}

	public NaturalNumberEn(int value) {
		super(value);
	}

	@Override
	protected void initIdioma() {
		textValue = Arrays
				.asList("zero", "one", "two", "three", "four", "five").toArray(
						new String[6]);
	}

}
