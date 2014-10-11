package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberCreatorEs extends NaturalNumberCreator {

	@Override
	public NaturalNumber createNumber() {
		return new NaturalNumberEs();
	}

	@Override
	public NaturalNumber createNumber(int valor) {
		return new NaturalNumberEs(valor);
	}


}
