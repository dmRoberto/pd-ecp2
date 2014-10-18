package es.upm.miw.pd.command.calculadora;

public abstract class ComandoAbstracto implements Comando {
	
	protected Calculadora receptor;
	
	protected String name;
	
	public ComandoAbstracto (Calculadora cal){
		this.receptor = cal;
	}
	
	@Override
	public String name() {
		return name;
	}
	

}
