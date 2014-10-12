package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberCreatorFr extends NaturalNumberCreator {

	@Override
	public NaturalNumber createNumber() {
		return new NaturalNumberFr();
	}

	@Override
	public NaturalNumber createNumber(int valor) {
		return new NaturalNumberFr(valor);
	}
}
