package es.upm.miw.pd.texto;


public class Parrafo extends ComponenteCompuesto {

	@Override
	public void add(Componente componenteToAdd) {
	    if (componenteToAdd != null && !componenteToAdd.isCompuesto()) {
	        this.lista.add(componenteToAdd);
	    }else {
	    	throw new UnsupportedOperationException("Operación no soportada");
	    }
	}

	@Override
	public void remove(Componente componenteToRemove) {
	    if (componenteToRemove != null) {
	        this.lista.remove(componenteToRemove);
	    }	
	}


	@Override
	public String dibujar(Boolean toUpperCase) {
		String result = "";
        for (Componente componente : this.lista) {
        	result =  result.concat(componente.dibujar(toUpperCase));
        }
        result = result.concat("\n");
		return result;
	}

}
