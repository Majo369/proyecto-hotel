package co.edu.uniquindio.hotel.Factory;

import co.edu.uniquindio.hotel.model.EmpresaHotel;

public class ModelFactory {
    private static ModelFactory modelFactory;
    private EmpresaHotel empresaHotel;

    private ModelFactory() {
        inicializarDatos();
    }

    public static ModelFactory getInstancia() {
        if(modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    public void inicializarDatos() {
    }

}
