/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacenvehiculos;

/**
 *
 * @author r3xzz
 */
// Clase VehiculoPasajeros.java
public class VehiculoPasajeros extends Vehiculo implements Rentable {
    private int cantidadPasajeros;

    public VehiculoPasajeros() {
        super();
    }

    public VehiculoPasajeros(String patente, double precioDiario, int cantidadDias, int cantidadPasajeros) {
        super(patente, precioDiario, cantidadDias);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    // Métodos accesadores y mutadores

    @Override
    public double calcularArriendo() {
        double descuento = getPrecioDiario() * getCantidadDias() * DESCUENTO_PASAJEROS;
        double subtotal = getPrecioDiario() * getCantidadDias() - descuento;
        return subtotal + (subtotal * IVA);
    }

    @Override
    public void mostrarBoleta() {
        System.out.println("Boleta de arriendo para vehiculo de pasajeros:");
        mostrarDatos();
        System.out.println("Total a pagar: $" + calcularArriendo());
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Patente: " + getPatente());
        System.out.println("Precio Diario: $" + getPrecioDiario());
        System.out.println("Cantidad de Dias: " + getCantidadDias());
        System.out.println("Cantidad de Pasajeros: " + cantidadPasajeros);
    }
}
