package es.upm.miw.pd.state.connection;

public class ConexionStateEsperando extends ConexionState {

	@Override
	public void abrir(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void cerrar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void parar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void iniciar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		if (respuesta == 0) {
			conexion.setConexionState(new ConexionStatePreparado());
		} else {
			conexion.setConexionState(new ConexionStateCerrado());
		}
	}

	@Override
	public Estado getEstado() {
		return Estado.ESPERANDO;
	}

}
