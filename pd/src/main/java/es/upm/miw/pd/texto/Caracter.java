package es.upm.miw.pd.texto;

public class Caracter extends Componente {

	private Character caracter;

	public Caracter(char caracter) {
		this.caracter = caracter;
	}

	@Override
	public void add(Componente componenteToAdd) {
	}

	@Override
	public void remove(Componente componenteToRemove) {
	}

	@Override
	public String dibujar(Boolean toUpperCase) {
		if (toUpperCase) {
			return caracter.toString().toUpperCase();
		} else {
			return caracter.toString();
		}
	}

	@Override
	public Boolean isCompuesto() {
		return false;
	}

}
