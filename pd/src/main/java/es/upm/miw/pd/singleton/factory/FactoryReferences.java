package es.upm.miw.pd.singleton.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * The Class FactoryReferences.
 */
public class FactoryReferences {

	/** Instancia privada de la clase, singleton */
	private static FactoryReferences factory = null;
	
	/** The references. */
	private Map<String, Integer> references;

	/** The reference. */
	private int reference;

	/**
	 * Para no permitir que existan mas instancias de la factoria de referencias
	 * el constructor tiene que ser privado.
	 */
	private FactoryReferences() {
		this.references = new HashMap<>();
		this.reference = 0;
	}

	/**
	 * Gets the reference.
	 *
	 * @param key
	 *            the key
	 * @return the reference
	 */
	public int getReference(String key) {
		Integer result = this.references.get(key);
		if (result == null) {
			this.references.put(key, this.reference);
			result = this.reference;
			reference++;
		}
		return result;
	}

	/**
	 * Devuelve la instancia de la factoria, en caso de que no este creada
	 * realiza el new.
	 *
	 * @return the factory
	 */
	public static FactoryReferences getFactory() {
		if (factory == null) {
			factory = new FactoryReferences();
		}
		return factory;
	}

	/**
	 * Removes the reference.
	 *
	 * @param key
	 *            the key
	 */
	public void removeReference(String key) {
		this.references.remove(key);
	}

}
