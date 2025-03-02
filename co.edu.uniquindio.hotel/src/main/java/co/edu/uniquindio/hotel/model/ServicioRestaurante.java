package co.edu.uniquindio.hotel.model;

import co.edu.uniquindio.hotel.Services.IConsumible;

public class ServicioRestaurante extends Servicio implements IConsumible {
    public ServicioRestaurante (String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void consumir() {
        System.out.println("Disfrutando del servicio de Restaurante" + getNombre());
    }
}
