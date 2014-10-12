package es.upm.miw.pd.state.connection;

public class ConexionStateParado extends ConexionState{

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
		// No hacer nada
	}

	@Override
	public void iniciar(Conexion conexion) {
		conexion.setConexionState(new ConexionStatePreparado());
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");	
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	@Override
	public Estado getEstado() {
		return Estado.PARADO;
	}

}
