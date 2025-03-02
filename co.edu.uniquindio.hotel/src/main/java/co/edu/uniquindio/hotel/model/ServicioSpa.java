package co.edu.uniquindio.hotel.model;

import co.edu.uniquindio.hotel.Services.IConsumible;

public class ServicioSpa extends Servicio implements IConsumible {
    public ServicioSpa (String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void consumir() {
        System.out.println("Disfrutando del servicio de Spa: " + getNombre());
    }
}
