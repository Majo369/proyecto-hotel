package model;

public class ServicioHabitacion extends Servicio {
    private String servicioExtra;
    private double precio;

    public ServicioHabitacion(boolean servicioSpa, boolean servicioRestaurante,
                              boolean serviciosLimpieza, String servicioExtra, double precio) {
        super(servicioSpa, servicioRestaurante, serviciosLimpieza);
        this.servicioExtra = servicioExtra;
        this.precio = precio;
    }
    public String getServicioExtra() {
        return servicioExtra;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setServicioExtra(String servicioExtra) {
        this.servicioExtra = servicioExtra;
    }
}
