package co.edu.uniquindio.hotel.model;

import co.edu.uniquindio.hotel.Services.IClienteCrud;

import java.util.ArrayList;

public class EmpresaHotel implements IClienteCrud {
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

    private boolean clienteIsExist(Cliente cliente) {
        for(Cliente cliente1:listaClientes){
            if(cliente.getIdentificacion().equalsIgnoreCase(cliente1.getIdentificacion())){return true;}
        }

        return false;
    }

    @Override
    public boolean agregarCliente(String nombre, String identificacion) {
        boolean clienteExist=clienteExist(identificacion);
        if(!clienteExist){
            Cliente cliente=new Cliente(nombre,identificacion);
            listaClientes.add(cliente);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarCliente(String identificacion) {
        for(Cliente cliente:listaClientes){
            if(cliente.getIdentificacion().equalsIgnoreCase(identificacion)){
                listaClientes.remove(cliente);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean actualizarCliente(String nombre, String identificacion) {
        Cliente cliente=buscarCliente(identificacion);
        if(cliente!=null){
            cliente.setNombre(nombre);
            return true;
        }

        return false;
    }

    @Override
    public boolean clienteExist(String identificacion) {
        for(Cliente cliente1:listaClientes){
            if(cliente1.getIdentificacion().equalsIgnoreCase(identificacion)){return true;}
        }

        return false;
    }

    @Override
    public Cliente buscarCliente(String identificacion){
        for(Cliente cliente1:listaClientes){
            if(cliente1.getIdentificacion().equalsIgnoreCase(identificacion)){return cliente1;}
        }

        return null;
    }
}


