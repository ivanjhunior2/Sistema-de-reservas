package presentacion;

//import negocio.GestorDeReservas;
//import negocio.ReservaDeAmbiente;
//import negocio.Notificacion;
//import datos.NotificacionImplementacion;
//import negocio.NotificacionUrgente;
//import negocio.NotificacionNormal;
//import negocio.Usuario;
//import datos.NotificacionConsola;

import negocio.*;
import datos.*;

public class SistemaDeReservas {
    public static void main(String[] args) {
        // Obtener la instancia única del GestorDeReservas
        GestorDeReservas gestor = GestorDeReservas.obtenerInstancia();

        // Crear las reservas
        ReservaDeAmbiente reserva = new ReservaDeAmbiente("690D", "Examen");
        ReservaDeAmbiente reserva2 = new ReservaDeAmbiente("Auditorio", "Clases normales");

        // Crear los usuarios con distintos tipos de notificación
        NotificacionImplementacion notificacionPorConsola = new NotificacionConsola();

        Notificacion notificacionUrgentePorConsola = new NotificacionUrgente(notificacionPorConsola);
        Notificacion notificacionNormalPorConsola = new NotificacionNormal(notificacionPorConsola);

        Usuario usuario = new Usuario("Ivan", notificacionNormalPorConsola);
        Usuario usuario2 = new Usuario("Jhunior", notificacionUrgentePorConsola);

        // Agregar observadores al gestor de reservas
        gestor.agregarObservador(usuario);
        gestor.agregarObservador(usuario2);

        // Agregar reservas y gestionarlas
        gestor.agregarReserva(reserva);
        gestor.asignarReserva(reserva, usuario);
        gestor.completarReserva(reserva);

        System.out.println("-----------------------------------------");

        gestor.agregarReserva(reserva2);
        gestor.asignarReserva(reserva2, usuario2);
        gestor.completarReserva(reserva2);

        gestor.imprimirReservas();
    }
}
