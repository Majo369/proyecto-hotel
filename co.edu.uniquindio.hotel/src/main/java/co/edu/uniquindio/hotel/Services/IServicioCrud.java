package co.edu.uniquindio.hotel.Services;

public interface IServicioCrud {
    boolean crearServicio(String nombre, String precio);
    boolean actualizarServicio(String nombre, String precio);
    boolean eliminarServicio(String nombre);
    boolean buscarServicio(String nombre);

}
