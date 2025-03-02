package co.edu.uniquindio.hotel.model;

import java.util.ArrayList;

public class Habitacion {
    private String numero;
    private TipoHabitacion tipoHabitacion;
    private double precio;
    private Reserva reservaAsociada;
    private ArrayList<Servicio>listaServiciosAsociados;

    public Habitacion(String numero, TipoHabitacion tipoHabitacion, double precio) {
        this.numero = numero;
        this.tipoHabitacion = tipoHabitacion;
        this.precio = precio;
        this.listaServiciosAsociados = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Reserva getReservaAsociada() {
        return reservaAsociada;
    }

    public void setReservaAsociada(Reserva reservaAsociada) {
        this.reservaAsociada = reservaAsociada;
    }

    public ArrayList<Servicio> getListaServiciosAsociados() {
        return listaServiciosAsociados;
    }

    public void setListaServiciosAsociados(ArrayList<Servicio> listaServiciosAsociados) {
        this.listaServiciosAsociados = listaServiciosAsociados;
    }

    
    
}
