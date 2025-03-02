package co.edu.uniquindio.hotel.Services;

import co.edu.uniquindio.hotel.model.Cliente;

public interface IModelFactoryServices {
    boolean agregarCliente(String nombreCliente,String identificacionCliente);
    boolean eliminarCliente(String identificacionCliente);
    boolean actualizarCliente(String nombreCliente,String identificacionCliente);
    Cliente buscarCliente(String identificacionCliente);
}
