package co.edu.uniquindio.hotel.model;

import co.edu.uniquindio.hotel.Services.IConsumible;

public class ServicioLimpieza extends Servicio implements IConsumible {
    public ServicioLimpieza(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void consumir() {
        System.out.println("Utilizando el servicio de Limpieza: " + getNombre());
    }
}
