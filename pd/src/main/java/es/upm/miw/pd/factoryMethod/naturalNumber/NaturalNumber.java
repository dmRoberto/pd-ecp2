package es.upm.miw.pd.factoryMethod.naturalNumber;

public abstract class NaturalNumber {

	private int value;

	protected static String[] textValue;
	
	public NaturalNumber() {
		this.initIdioma();
	}


	public NaturalNumber(int value) {
		this.initIdioma();
		this.setValue(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		assert value >= 0;
		this.value = value;
	}

	public void add(int value) {
		this.setValue(this.value + value);
	}

	public String getTextValue() {
		if (this.value < textValue.length) {
			return NaturalNumber.textValue[this.value];
		} else {
			return "???";
		}
	}
	
	protected abstract void initIdioma ();

}
