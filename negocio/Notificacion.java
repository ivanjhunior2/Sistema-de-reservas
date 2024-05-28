package negocio;

import datos.*;

public abstract class Notificacion {
    protected NotificacionImplementacion implementacion;
    protected Notificacion(NotificacionImplementacion implementacion) {
        this.implementacion = implementacion;
    }

    public abstract void enviar(String mensaje);
}
