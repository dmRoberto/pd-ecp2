package es.upm.miw.pd.command.calculadora.memento;

import upm.jbb.IO;
import es.upm.miw.pd.command.calculadora.Calculadora;
import es.upm.miw.pd.command.calculadora.ComandoImprimir;
import es.upm.miw.pd.command.calculadora.ComandoIniciar;
import es.upm.miw.pd.command.calculadora.ComandoRestar;
import es.upm.miw.pd.command.calculadora.ComandoSumar;
import es.upm.miw.pd.command.calculadora.GestorComandos;

public class MainCalculadoraMementable {
	private GestorComandos gestor;
	private GestorMementos<MementoCalculadora> gestorMemento;

	public MainCalculadoraMementable() {
		Calculadora calc = new CalculadoraMementable();
		this.gestor = new GestorComandos();
		this.gestorMemento = new GestorMementos<MementoCalculadora>();
		this.gestor.add(new ComandoSumar(calc));
		this.gestor.add(new ComandoRestar(calc));
		this.gestor.add(new ComandoIniciar(calc));
		this.gestor.add(new ComandoImprimir(calc));
		
		this.gestor.add(new ComandoGuardar(calc, gestorMemento));
		this.gestor.add(new ComandoDeshacer(calc, gestorMemento));
	}

	public void ejecutar() {
		String key = (String) IO.in.select(this.gestor.keys());
		this.gestor.execute(key);
	}

	public static void main(String[] args) {
		IO.in.addController(new MainCalculadoraMementable());
	}
}
