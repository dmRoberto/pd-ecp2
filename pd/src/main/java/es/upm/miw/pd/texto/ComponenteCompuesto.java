package es.upm.miw.pd.texto;

import java.util.ArrayList;
import java.util.List;

public abstract class ComponenteCompuesto extends Componente {

	protected List<Componente> lista = new ArrayList<Componente>();

	@Override
	public Boolean isCompuesto() {
		return true;
	}

}
