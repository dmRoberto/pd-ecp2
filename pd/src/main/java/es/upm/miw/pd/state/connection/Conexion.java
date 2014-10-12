package es.upm.miw.pd.state.connection;

public class Conexion {
   
    private ConexionState conexionState;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.conexionState = new ConexionStateCerrado();
    }

    public Link getLink() {
        return link;
    }
    
    public void setConexionState (ConexionState conexionState){
    	this.conexionState = conexionState;
    }

    public Estado getEstado() {
        return this.conexionState.getEstado();
    }

    public void abrir() {
    	conexionState.abrir(this);
    }

    public void cerrar() {
    	conexionState.cerrar(this);
    }

    public void parar() {
    	conexionState.parar(this);
    }

    public void iniciar() {
    	conexionState.iniciar(this);
    }

    public void enviar(String msg) {
    	conexionState.enviar(this, msg);
    }

    public void recibir(int respuesta) {
    	conexionState.recibir(this, respuesta);
    }

}
