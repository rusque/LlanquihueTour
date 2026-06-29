package model;

public class ServicioTuristico {
    protected String nombre;
    protected int duracionHoras;

    // Este constructor debe coincidir exactamente con el super() de las hijas
    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    @Override
    public String toString() {
        return "Servicio: " + nombre + " | Duración: " + duracionHoras + " hrs";
    }
}