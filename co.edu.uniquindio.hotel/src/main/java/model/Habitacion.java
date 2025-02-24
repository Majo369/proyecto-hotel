package model;

public class Habitacion {
    private String numero;
    private String tipoHabitacion;
    private double precio;
    private Reserva reservaAsociada;

    public Habitacion(String numero, String tipoHabitacion, double precio){
        this.numero = numero;
        this.tipoHabitacion = tipoHabitacion;
        this.precio = precio;
    }
}
