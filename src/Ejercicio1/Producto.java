/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author ayrth
 */
public class Producto {
    private int codigo, stock;
    private String nombre;
    private double precio;

    // Constructores
    public Producto(int codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto() {
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }

    public int getStock() {
        return stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // Setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setStock(int stock) {
        if(stock < 0){
            System.out.println("El stock no puede ser negativo.");
        }
        this.stock = stock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if(!validarPrecio(precio)){
            System.out.println("El precio debe ser mayor a 0");
        }
        this.precio = precio;
    }

    public double calcularSubtotal(){
        return precio * stock;
    }

    public void mostrarDatos(){
        System.out.println("Codigo: " + codigo + " Nombre: " + nombre + " Precio: " + precio + " Stock: " + stock);
    }

    public static boolean validarPrecio(double precio){
        return precio > 0;
    }
}