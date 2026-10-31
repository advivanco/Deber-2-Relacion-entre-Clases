/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author ayrth
 */
public class ComplejoDeportivo {
    private String nombre, ubicacion;
    private ArrayList<Reserva> reservas;
    //Constructores

    public ComplejoDeportivo(String nombre, String ubicacion, ArrayList<Reserva> reservas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.reservas = reservas;
    }

    public ComplejoDeportivo() {
    }
    //getters

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
    //setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }
    
    public void agregarReserva(Reserva reserva){
        if(reservas==null){
        reservas= new ArrayList<>();
    }
        reservas.add(reserva);
    }
    
    public void mostrarReservas(){
        if(reservas!=null){
            for(Reserva r: reservas){
                r.mostrarDatos();
            }
        }
    }
    
    public int calcularHorasReservada(){
        int totalHoras=0;
        if(reservas!=null){
            for(Reserva r: reservas){
                totalHoras += r.calcularDuracion();
            }
        }
        return totalHoras;
    }
}
