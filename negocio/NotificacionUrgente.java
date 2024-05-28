package negocio;

import datos.*;

public class NotificacionUrgente extends Notificacion {
    public NotificacionUrgente(NotificacionImplementacion implementacion) {
        super(implementacion);
    }

    @Override
    public void enviar(String mensaje) {
        implementacion.enviarNotificacion("¡URGENTE! " + mensaje);
    }
}
