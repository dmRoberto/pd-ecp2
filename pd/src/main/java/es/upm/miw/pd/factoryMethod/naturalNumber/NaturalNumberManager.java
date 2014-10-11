package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberManager {

	NaturalNumber naturalNumber;
	NaturalNumberCreator naturalNumberCreator;

	public void createNumber() {
		this.naturalNumber = naturalNumberCreator.createNumber();
	}

	public void createNumber(int valor) {
		this.naturalNumber = naturalNumberCreator.createNumber(valor);
	}

	public void setNumberCreator(NaturalNumberCreator creator) {
		this.naturalNumberCreator = creator;
	}

	public NaturalNumber getNaturalNumber() {
		return this.naturalNumber;
	}

}
