package negocio;

import java.util.*;
import datos.*;

public class GestorDeReservas {
    private static GestorDeReservas instancia = null;
    private List<Reserva> reservas = new ArrayList<>();
    private List<Observador> observadores = new ArrayList<>();

    private GestorDeReservas() {}

    public static GestorDeReservas obtenerInstancia() {
        if (instancia == null) {
            instancia = new GestorDeReservas();
        }
        return instancia;
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
        System.out.println("Reserva añadida para el ambiente: " + reserva.nombre + " motivo: " + reserva.descripcion);
        notificarObservadores("Se ha añadido una reserva para el ambiente: " + reserva.nombre + " motivo: " + reserva.descripcion);
    }

    public void asignarReserva(Reserva reserva, Notificable notificable) {
        notificable.notificar("Se ha asignado una reserva para el ambiente: " + reserva.nombre + " motivo: " + reserva.descripcion);
        notificarObservadores("Se ha asignado una reserva para el ambiente: " + reserva.nombre + " motivo: " + reserva.descripcion);
    }

    public void completarReserva(Reserva reserva) {
        reserva.completarReserva();
        notificarObservadores("Se ha completado una reserva para el ambiente: " + reserva.nombre + " motivo: " + reserva.descripcion);
    }

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    private void notificarObservadores(String mensaje) {
        for (Observador observador : observadores) {
            observador.actualizar(mensaje);
        }
    }

    public void imprimirReservas() {
        System.out.println("------------------Lista de Reservas-----------------");
        for (Reserva reserva : reservas) {
            System.out.println("Ambiente: " + reserva.nombre + ", Motivo: " + reserva.descripcion);
        }
    }
}
