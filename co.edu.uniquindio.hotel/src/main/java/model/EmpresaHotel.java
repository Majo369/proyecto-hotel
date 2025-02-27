package model;

import java.util.ArrayList;

public class EmpresaHotel {
    private String nombre;
    private ArrayList<Reserva> listaReservas=new ArrayList<>();
    private ArrayList<Habitacion>listaHabitaciones=new ArrayList<>();
    private ArrayList<Cliente>listaClientes=new ArrayList<>();
    private ArrayList<ServicioHabitacion>listaServiciosHabitacion=new ArrayList<>();

    public EmpresaHotel(String nombre) {
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<ServicioHabitacion> getListaServiciosHabitacion() {
        return listaServiciosHabitacion;
    }

    public void setListaServiciosHabitacion(ArrayList<ServicioHabitacion> listaServiciosHabitacion) {
        this.listaServiciosHabitacion = listaServiciosHabitacion;
    }

    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(ArrayList<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
}
