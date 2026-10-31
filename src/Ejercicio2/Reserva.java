/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author ayrth
 */
public class Reserva {
    private int codigo, horas;
    private String nombreUsuario, tipoCancha;
    //Constructores

    public Reserva(int codigo, int horas, String nombreUsuario, String tipoCancha) {
        this.codigo = codigo;
        this.horas = horas;
        this.nombreUsuario = nombreUsuario;
        this.tipoCancha = tipoCancha;
    }

    public Reserva() {
    }
    //getters

    public int getCodigo() {
        return codigo;
    }

    public int getHoras() {
        return horas;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getTipoCancha() {
        return tipoCancha;
    }
    //setters

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setTipoCancha(String tipoCancha) {
        this.tipoCancha = tipoCancha;
    }
    //Métodos
    public int calcularDuracion(){
        return horas;
        
    }
    
    public void mostrarDatos(){
        System.out.println("Codigo de Reserva: " +codigo); 
        System.out.println("Nombre del Usuario: " +nombreUsuario);
        System.out.println("Tipo de Cancha: " +tipoCancha);
        System.out.println("Cantidad de Horas: " +horas);
    }
    
    public static boolean validarHoras(int horas){
        return horas > 0 && horas <= 5;
    }
}
