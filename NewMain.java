package logica;

import java.text.ParseException;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) throws ParseException {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        Hotel h = new Hotel("Chekton");
        h.pregargarDatosHabitaciones();

        while (salir == false) {
            System.out.println("Bienvenido al panel de administracion del Hotel "+h.getNombre());
            System.out.println("Ingrese un numero segun las opciones");
            System.out.println("1.-Mostrar todas las habitaciones");
            System.out.println("2.-Buscar habitacion por el numero");
            System.out.println("3.-Buscar persona por rut");
            System.out.println("4.-Agregar reserva de habitacion");
            System.out.println("5.-Eliminar reserva de habitacion");
            System.out.println("6.-Salir");
            String opc = teclado.next();

            switch (opc) {
                case "1":
                    h.mostrarHabitaciones();
                    System.out.println("");
                    break;
                case "2":
                    h.buscarHabitacion();
                    System.out.println("");
                    break;
                case "3":
                    h.buscarPersonaPorRut();
                    System.out.println("");
                    break;
                case "4":
                    h.hacerReservaDeHabitacion();
                    break;
                case "5":
                    h.eliminarReservaDeHabitacion();
                    break;
                case "6":
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida,Ingresar nuevamente");
                    System.out.println("");
            }

        }
    }
    

}
