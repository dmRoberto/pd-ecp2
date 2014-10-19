package es.upm.miw.pd.command.calculadora.memento;

public interface Mementable <T>{
	
	public T createMemento ();
	
	public void restoreMemento (T memento);

}
