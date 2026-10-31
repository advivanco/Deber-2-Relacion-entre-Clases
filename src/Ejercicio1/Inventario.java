/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author ayrth
 */
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    // Constructores
    public Inventario(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // Getters
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    // Setters
    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public void mostrarProductos(){
        if(productos.isEmpty()){
            System.out.println("El inventario esta vacio");
            return;
        }
        System.out.println("==Lista de Productos==");
        for(Producto p : productos){
            p.mostrarDatos();
        }
    }

    public double calcularValorInventario(){
        double valorTotal = 0;
        for (Producto p : productos) {
            valorTotal += p.calcularSubtotal();
        }
        return valorTotal;
    }

    public void agregarProducto(Producto producto){
        if(producto != null){
            productos.add(producto); // Corregido para agregar a la lista correctamente
            System.out.println("Producto agregado correctamente.");
        } else {
            System.out.println("No se puedo agregar el producto.");
        }
    }
}
