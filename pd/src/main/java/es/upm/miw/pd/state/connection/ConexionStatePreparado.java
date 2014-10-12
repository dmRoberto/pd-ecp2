package es.upm.miw.pd.state.connection;

public class ConexionStatePreparado extends ConexionState {

	@Override
	public void abrir(Conexion conexion) {
		// No hacer nada
	}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setConexionState(new ConexionStateCerrado());
	}

	@Override
	public void parar(Conexion conexion) {
		conexion.setConexionState(new ConexionStateParado());
	}

	@Override
	public void iniciar(Conexion conexion) {
		// No hacer nada
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		conexion.getLink().enviar(msg);
		conexion.setConexionState(new ConexionStateEsperando());
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public Estado getEstado() {
		return Estado.PREPARADO;
	}

}
