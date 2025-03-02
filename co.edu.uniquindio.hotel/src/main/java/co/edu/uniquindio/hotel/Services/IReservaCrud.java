package co.edu.uniquindio.hotel.Services;

public interface IReservaCrud {
    boolean crearReserva(String fechaInicio, String fechaFin, String cliente, String habitacion, String servicio);
    boolean actualizarReserva(String fechaInicio, String fechaFin, String cliente, String habitacion, String servicio);
    boolean eliminarReserva(String fechaInicio, String fechaFin, String cliente, String habitacion, String servicio);
    boolean buscarReserva(String fechaInicio, String fechaFin, String cliente, String habitacion, String servicio);
}
