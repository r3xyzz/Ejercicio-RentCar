/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacenvehiculos;

/**
 *
 * @author r3xzz
 */
// Clase VehiculoCarga.java
public class VehiculoCarga extends Vehiculo implements Rentable {
    private double capacidadCarga;

    public VehiculoCarga() {
        super();
    }

    public VehiculoCarga(String patente, double precioDiario, int cantidadDias, double capacidadCarga) {
        super(patente, precioDiario, cantidadDias);
        this.capacidadCarga = capacidadCarga;
    }

    // Métodos accesadores y mutadores

    @Override
    public double calcularArriendo() {
        double descuento = getPrecioDiario() * getCantidadDias() * DESCUENTO_CARGA;
        double subtotal = getPrecioDiario() * getCantidadDias() - descuento;
        return subtotal + (subtotal * IVA);
    }

    @Override
    public void mostrarBoleta() {
        System.out.println("Boleta de arriendo para vehiculo de carga:");
        mostrarDatos();
        System.out.println("Total a pagar: $" + calcularArriendo());
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Patente: " + getPatente());
        System.out.println("Precio Diario: $" + getPrecioDiario());
        System.out.println("Cantidad de Dias: " + getCantidadDias());
        System.out.println("Capacidad de Carga: " + capacidadCarga + " kg");
    }
}