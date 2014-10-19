package es.upm.miw.pd.command.calculadora;

public class ComandoIniciar extends ComandoAbstracto {

	public ComandoIniciar(Calculadora calc) {
		super(calc);
		name = "iniciar";
	}

	@Override
	public void execute() {
		calculadora.iniciar();
	}

}
