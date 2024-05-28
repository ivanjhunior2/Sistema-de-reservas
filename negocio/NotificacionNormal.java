package negocio;

import datos.*;

public class NotificacionNormal extends Notificacion {
    public NotificacionNormal(NotificacionImplementacion implementacion) {
        super(implementacion);
    }

    @Override
    public void enviar(String mensaje) {
        implementacion.enviarNotificacion("Normal: " + mensaje);
    }
}
