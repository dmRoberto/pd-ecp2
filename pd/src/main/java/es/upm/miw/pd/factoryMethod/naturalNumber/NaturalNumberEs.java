package es.upm.miw.pd.factoryMethod.naturalNumber;

import java.util.Arrays;

public class NaturalNumberEs extends NaturalNumber {

	public NaturalNumberEs() {
		super();
	}

	public NaturalNumberEs(int value) {
		super(value);
	}

	@Override
	protected void initIdioma() {
		textValue = Arrays.asList("cero", "uno", "dos", "tres", "cuatro",
				"cinco").toArray(new String[6]);
	}
}
