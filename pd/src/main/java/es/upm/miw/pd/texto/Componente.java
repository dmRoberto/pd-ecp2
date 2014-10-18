package es.upm.miw.pd.texto;

public abstract class Componente {

	public abstract void add(Componente componenteToAdd);
	
	public abstract void remove(Componente componenteToRemove);

	public abstract String dibujar(Boolean toUpperCase);
	
	public abstract Boolean isCompuesto ();

}
