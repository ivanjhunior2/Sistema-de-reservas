package negocio;

public class ReservaDeAmbiente extends Reserva {
    public ReservaDeAmbiente(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    @Override
    public void completarReserva() {
        System.out.println("Reserva completada para el ambiente: " + nombre + " " + descripcion);
    }
}
