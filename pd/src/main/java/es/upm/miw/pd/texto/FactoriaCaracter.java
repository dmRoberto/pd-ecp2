package es.upm.miw.pd.texto;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {

	private static FactoriaCaracter factoria;

	private Map<Character, Caracter> mapaCaracteres = new HashMap<Character, Caracter>();

	public static FactoriaCaracter getFactoria() {
		if (factoria == null) {
			factoria = new FactoriaCaracter();
		}
		return factoria;
	}

	public Caracter get(char caracter) {
		if (!mapaCaracteres.containsKey(caracter)) {
			mapaCaracteres.put(new Character(caracter), new Caracter(caracter));
		}
		return mapaCaracteres.get(caracter);
	}

}
