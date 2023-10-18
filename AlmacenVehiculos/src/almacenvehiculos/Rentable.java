/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package almacenvehiculos;

/**
 *
 * @author r3xzz
 */

// Archivo de interfaz Rentable.java
public interface Rentable {
    double IVA = 0.19;
    double DESCUENTO_CARGA = 0.03;
    double DESCUENTO_PASAJEROS = 0.07;

    double calcularArriendo();
    void mostrarBoleta();
}