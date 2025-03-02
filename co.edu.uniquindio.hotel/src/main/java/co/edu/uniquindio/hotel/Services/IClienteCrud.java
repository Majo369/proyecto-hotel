package co.edu.uniquindio.hotel.Services;

public interface IClienteCrud {
    public void crearCliente(String nombre, String identificacion);
    public void actualizarCliente(String nombre, String identificacion);
    public void eliminarCliente(String identificacion);
    public void buscarCliente(String identificacion);

}
