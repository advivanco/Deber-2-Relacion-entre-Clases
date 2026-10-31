/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ayrth
 */
public class GestiondeReservasDeportivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ComplejoDeportivo complejo= new ComplejoDeportivo("Complejo Central", "Quito", new ArrayList<>());
        int op=0;
        do{
            System.out.println("==MENU DE GESTION "+complejo.getNombre().toUpperCase()+"==");
            System.out.println("1. Agregar Reserva");
            System.out.println("2. Mostrar Reservas");
            System.out.println("3. Calcular Total de Horas Reservadas");
            System.out.println("4. Salir");
            System.out.print("Elija la opcion deseada: ");
            op=sc.nextInt();
            sc.nextLine();
            switch(op){
                case 1:
                    System.out.print("Ingrese el codigo de la reserva (numero): ");
                    int codigo= sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Ingrese el nombre del usuario: ");
                    String usuario= sc.nextLine();
                    
                    System.out.print("Ingrese el tipo de cancha: ");
                    String cancha=sc.nextLine();
                    
                    int horas;
                    do{
                        System.out.print("Ingrese la cantidad de horas (5 horas maximo): ");
                        horas=sc.nextInt();
                        sc.nextLine();
                        if(!Reserva.validarHoras(horas)){
                            System.out.println("Las horas deben ser mayor a 0 horas y menor a 5 horas!!");
                            System.out.println("Intente nuevamente...");
                        }
                    }while(!Reserva.validarHoras(horas));
                    Reserva nuevaReserva= new Reserva(codigo, horas, usuario, cancha);
                    complejo.agregarReserva(nuevaReserva);
                    System.out.println("Reserva agrega exitosamente.");
                    break;
                    
                case 2:
                    System.out.println("==Listad De Reservas==");
                    complejo.mostrarReservas();
                    break;
                    
                case 3:
                    int totalHoras= complejo.calcularHorasReservada();
                    System.out.println("Total de horas reservadas: " +totalHoras+ "Hora(s).");
                    break;
                case 4:
                    System.out.println("Saliendo del sistema.....");
                    break;
                    
                default:
                    System.out.println("Opcion inválida.");
                    System.out.println("Elija una opcion de la 1 a la 4.");
            }
        }while (op!=4);
        sc.close();
    }
    
}
