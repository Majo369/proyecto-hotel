package co.edu.uniquindio.hotel.Factory;

import co.edu.uniquindio.hotel.Services.IModelFactoryServices;
import co.edu.uniquindio.hotel.model.Cliente;
import co.edu.uniquindio.hotel.model.EmpresaHotel;

public class ModelFactory implements IModelFactoryServices {
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
        empresaHotel =new EmpresaHotel("Empresa hotel");
        agregarCliente("Ana Gómez", "987654321");
        agregarCliente("Carlos Rodríguez", "112233445");
        agregarCliente("Juan Pérez", "123456789");

        
    }


    @Override
    public boolean agregarCliente(String nombreCliente,String identificacionCliente) {

        return empresaHotel.agregarCliente(nombreCliente,identificacionCliente);
    }

    @Override
    public boolean eliminarCliente(String identificacionCliente){

        return empresaHotel.eliminarCliente(identificacionCliente);
    }

    @Override
    public boolean actualizarCliente(String nombreCliente,String identificacionCliente) {

        return empresaHotel.actualizarCliente(nombreCliente,identificacionCliente);
    }
    //hola

    @Override
    public Cliente buscarCliente(String identificacionCliente) {

        return empresaHotel.buscarCliente(identificacionCliente);
    }
}
