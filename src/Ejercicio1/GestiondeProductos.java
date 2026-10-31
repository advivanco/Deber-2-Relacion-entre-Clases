/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;
import java.util.Scanner;
/**
 *
 * @author ayrth
 */
public class GestiondeProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    Inventario inventario = new Inventario();
    int opcion = 0;
    
    do {
        System.out.println("==Menu de Gestion de Productos==");
        System.out.println("1. Agregar Productos");
        System.out.println("2. Mostrar Productos");
        System.out.println("3. Calcular Valor Total");
        System.out.println("4. Salir");
        System.out.println("Elija una opcion: ");
        opcion = sc.nextInt();
        
        switch(opcion) {
            case 1:
                System.out.println("Ingrese el codigo del producto: ");
                int codigo = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese el nombre del producto: ");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el precio del producto: $ ");
                double precio = sc.nextDouble();
                sc.nextLine();
                System.out.println("Ingrese el stock: ");
                int stock = sc.nextInt();
                sc.nextLine();
                try {
                    Producto p = new Producto(codigo, nombre, precio, stock);
                    inventario.agregarProducto(p);
                } catch(IllegalArgumentException e) {
                    System.out.println("Error" + e.getMessage());
                }
                break;
                
            case 2:
                inventario.mostrarProductos();
                break;
                
            case 3:
                double total = inventario.calcularValorInventario();
                System.out.println("Valor total : " + total);
                break;
                
            case 4:
                System.out.println("Saliendo del Programa...");
                break;
                
            default:
                System.out.println("Opcion Valida..");
        }
    } while (opcion != 4);
    
    sc.close();
    }
}
