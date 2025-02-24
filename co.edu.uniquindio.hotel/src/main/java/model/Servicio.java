package model;

public class Servicio {
    private boolean servicioSpa;
    private boolean servicioRestaurante;
    private boolean serviciosLimpieza;
    private Habitacion habitacionAsociado;

    public Servicio (boolean servicioSpa, boolean servicioRestaurante, boolean serviciosLimpieza){
        this.servicioSpa = servicioSpa;
        this.servicioRestaurante = servicioRestaurante;
        this.serviciosLimpieza = serviciosLimpieza;
    }

    public Habitacion getHabitacionAsociado() {
        return habitacionAsociado;
    }

    public void setHabitacionAsociado(Habitacion habitacionAsociado) {
        this.habitacionAsociado = habitacionAsociado;
    }

    public boolean isServicioRestaurante() {
        return servicioRestaurante;
    }

    public void setServicioRestaurante(boolean servicioRestaurante) {
        this.servicioRestaurante = servicioRestaurante;
    }

    public boolean isServiciosLimpieza() {
        return serviciosLimpieza;
    }

    public void setServiciosLimpieza(boolean serviciosLimpieza) {
        this.serviciosLimpieza = serviciosLimpieza;
    }

    public boolean isServicioSpa() {
        return servicioSpa;
    }

    public void setServicioSpa(boolean servicioSpa) {
        this.servicioSpa = servicioSpa;
    }
}
