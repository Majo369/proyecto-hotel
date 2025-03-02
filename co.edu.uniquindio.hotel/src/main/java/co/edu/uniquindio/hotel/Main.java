package co.edu.uniquindio.hotel;

import co.edu.uniquindio.hotel.Factory.ModelFactory;
import co.edu.uniquindio.hotel.model.Cliente;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstancia();
        menuHotel(modelFactory);
    }

    private static void menuHotel(ModelFactory modelFactory) {
        String menuPrincipal = mensajeMenu();
        int opcionSeleccionada = 0;
        do {
            opcionSeleccionada = Integer.parseInt(JOptionPane.showInputDialog(null, menuPrincipal));
            String mensajeSubMenu = mensajeSubMenu(opcionSeleccionada);
            int opcionSubMenu = Integer.parseInt(JOptionPane.showInputDialog(null, mensajeSubMenu));
            metodosSubMenu(opcionSeleccionada, opcionSubMenu, modelFactory);

        } while (opcionSeleccionada < 8);
    }

    private static void metodosSubMenu(int opcionSelecciona, int opcionSubMenu, ModelFactory modelFactory) {
        switch (opcionSelecciona) {
            case 1:
                metodosCliente(opcionSubMenu, modelFactory);
                break;
            case 2:
                metodosReserva(opcionSubMenu, modelFactory);
                break;
            case 3:
                metodosHabitacio(opcionSubMenu, modelFactory);
                break;
            case 4:
                metodosServicio(opcionSubMenu, modelFactory);
                break;
        }
    }

    private static void metodosServicio(int opcionSubMenu, ModelFactory modelFactory) {
    }

    private static void metodosHabitacio(int opcionSubMenu, ModelFactory modelFactory) {
    }

    private static void metodosReserva(int opcionSubMenu, ModelFactory modelFactory) {
    }

    private static void metodosCliente(int opcionSubMenu, ModelFactory modelFactory) {
        switch (opcionSubMenu) {
            case 1:
                agregarCliente(modelFactory);
                break;
            case 2:
                eliminarCliente(modelFactory);
                break;
            case 3:
                actualizarCliente(modelFactory);
                break;
            case 4:
                buscarCliente(modelFactory);
                break;
        }
    }

    private static String mensajeSubMenu(int opcionSeleccionada) {
        String subMenu = "";
        switch (opcionSeleccionada) {
            case 1:
                subMenu = "1.Agregar Cliente\n" +
                        "2.Eliminar Cliente\n" + "3.Actualizar Cliente\n" + "4.Buscar Cliente";
                break;
            case 2:
                subMenu = "1.Agregar Reserva\n" +
                        "2.Eliminar Reserva\n" + "3.Actualizar Reserva\n" + "4.Buscar Reserva";
                break;
            case 3:
                subMenu = "1.Agregar Habitacion\n" +
                        "2.Eliminar Habitacion\n" + "3.Actualizar Habitacion\n" + "4.Buscar Habitacion";
                break;
            case 4:
                subMenu = "1.Agregar Servicio\n" +
                        "2.Eliminar Servicio\n" + "3.Actualizar Servicio\n" + "4.Buscar Servicio";
                break;
        }

        return subMenu;
    }

    private static void opcionMenuPrincipal(int opcionSeleccionada) {
    }

    private static String mensajeMenu() {
        String menu = "Menu principal\n" +
                "1.Menu cliente\n" +
                "2.Menu Reserva\n" +
                "3.Menu Habitacion\n" +
                "4.Menu servicio";

        return menu;
    }

    private static void agregarCliente(ModelFactory modelFactory) {
        String nombreCliente = JOptionPane.showInputDialog
                (null, "Ingrese el nombre del cliente");
        String identificacion = JOptionPane.showInputDialog
                (null, "Ingrese el identificacion del cliente");
        boolean isAgregado = modelFactory.agregarCliente(nombreCliente, identificacion);
        mensajeResultado(isAgregado, "cliente agregado exitosamente", "Cliente no fue agregado");

    }

    private static void eliminarCliente(ModelFactory modelFactory) {
        String identificacion = JOptionPane.showInputDialog
                (null, "Ingrese el identificacion del cliente");
        boolean isEliminado=modelFactory.eliminarCliente(identificacion);
        mensajeResultado(isEliminado,
                "El cliente fue eliminado exitosamente", "Cliente no fue eliminado");
    }

    private static void actualizarCliente(ModelFactory modelFactory) {
        String identificacion=JOptionPane.showInputDialog("Ingrese el identificacion del cliente");
        String nombre=JOptionPane.showInputDialog("Ingrese el nombre actualizado del cliente");
        Boolean isActualizado=modelFactory.actualizarCliente(nombre,identificacion);
        mensajeResultado(isActualizado,
                "El cliente fue actualizado exitosamente","Cliente no fue actualizado");
    }

    private static void buscarCliente(ModelFactory modelFactory) {
        String identificacion=JOptionPane.showInputDialog("Ingrese el identificacion del cliente");
        Cliente cliente=modelFactory.buscarCliente(identificacion);
        boolean condicion=(cliente!=null);
        mensajeResultado(condicion, "El cliente con identificacion "+identificacion+
                " fue encontrado y su nombre es "+ cliente.getNombre(),"El cliente no fue encontrado");
    }

    private static void mensajeResultado(boolean condicion, String opcion1, String opcion2) {
        JOptionPane.showMessageDialog(null, condicion ? opcion1 : opcion2);
    }
}
