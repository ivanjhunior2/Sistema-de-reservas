package datos;

public class NotificacionConsola implements NotificacionImplementacion {
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Notificación por consola: " + mensaje);
    }
}
