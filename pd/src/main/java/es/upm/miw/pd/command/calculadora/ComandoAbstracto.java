package es.upm.miw.pd.command.calculadora;

public abstract class ComandoAbstracto implements Comando {
	
	protected Calculadora calculadora;
	
	protected String name;
	
	public ComandoAbstracto (Calculadora cal){
		this.calculadora = cal;
	}
	
	@Override
	public String name() {
		return name;
	}
	

}
