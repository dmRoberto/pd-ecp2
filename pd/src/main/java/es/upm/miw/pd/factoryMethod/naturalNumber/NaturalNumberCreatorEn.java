package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberCreatorEn extends NaturalNumberCreator {

	@Override
	public NaturalNumber createNumber() {
		return new NaturalNumberEn();
	}

	@Override
	public NaturalNumber createNumber(int valor) {
		return new NaturalNumberEn(valor);
	}

}
