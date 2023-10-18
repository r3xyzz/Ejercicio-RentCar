/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacenvehiculos;


/**
 *
 * @author r3xzz
 */

// Clase abstracta Vehiculo.java
public abstract class Vehiculo {
    private String patente;
    private double precioDiario;
    private int cantidadDias;

    public Vehiculo() {
        // Constructor vacío
    }

    public Vehiculo(String patente, double precioDiario, int cantidadDias) {
        this.patente = patente;
        this.precioDiario = precioDiario;
        this.cantidadDias = cantidadDias;
    }

    // Métodos accesadores y mutadores

    public abstract void mostrarDatos(); // Método abstracto completo

    public String getPatente() {
        return patente;
    }

    public double getPrecioDiario() {
        return precioDiario;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    void mostrarBoleta() {
        throw new UnsupportedOperationException("Por ahora aun no es compatible."); //No debe estar en una clase abstracta si deseas que todas las clases hijas concretas implementen este método. 
    }
}
