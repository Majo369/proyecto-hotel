package co.edu.uniquindio.hotel.Services;

public interface IClienteCrud {
    boolean crearCliente(String nombre, String identificacion);
    boolean actualizarCliente(String nombre, String identificacion);
    boolean eliminarCliente(String identificacion);
    boolean buscarCliente(String identificacion);

}
