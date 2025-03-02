package co.edu.uniquindio.hotel.Services;

import co.edu.uniquindio.hotel.model.Cliente;

public interface IClienteCrud {
    boolean agregarCliente(String nombre, String identificacion);
    boolean actualizarCliente(String nombre, String identificacion);
    boolean eliminarCliente(String identificacion);
    boolean clienteExist(String identificacion);
    Cliente buscarCliente(String identificacionCliente);

}
