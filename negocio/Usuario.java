package negocio;

public class Usuario implements Notificable, Observador {
    private String nombre;
    private Notificacion notificacion;

    public Usuario(String nombre, Notificacion notificacion) {
        this.nombre = nombre;
        this.notificacion = notificacion;
    }

    @Override
    public void notificar(String message) {
        System.out.println("Notificando a " + nombre + ": " + message);
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Notificando a " + nombre + ": " + mensaje);
    }
}
