package negocio;

public abstract class Reserva {
    protected String nombre;
    protected String descripcion;

    public Reserva(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract void completarReserva();
}
