package co.edu.uniquindio.hotel.Services;

public interface IHabitacionCrud {

    boolean crearHabitacion(String numero, String tipo, String descripcion, String precio, String estado);
    boolean actualizarHabitacion(String numero, String tipo, String descripcion, String precio, String estado);
    boolean eliminarHabitacion(String numero);
    boolean buscarHabitacion(String numero);

}
