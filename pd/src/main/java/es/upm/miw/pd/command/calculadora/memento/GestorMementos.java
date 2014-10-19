package es.upm.miw.pd.command.calculadora.memento;

import java.util.Map;
import java.util.TreeMap;

public class GestorMementos <T>{
	
    private Map<String, T> lista = new TreeMap<String, T>();

    public void addMemento(String key, T memento) {
        this.lista.put(this.lista.size() + ":" + key, memento);
    }

    public T getMemento(String key) {
        return this.lista.get(key);
    }

    public String[] keys() {
        return this.lista.keySet().toArray(new String[0]);
    }

}
