/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package almacenvehiculos;

import java.util.List;
/**
 *
 * @author r3xzz
 */
// Clase Main.java

public class Main {
    public static void main(String[] args) {
        AlmacenVehiculos almacen = new AlmacenVehiculos();

        VehiculoCarga vehiculoCarga = new VehiculoCarga("ABC123", 100, 10, 5000);
        VehiculoPasajeros vehiculoPasajeros = new VehiculoPasajeros("XYZ456", 50, 5, 4);

        almacen.agregarVehiculo(vehiculoCarga);
        almacen.agregarVehiculo(vehiculoPasajeros);

        List<Vehiculo> listaVehiculos = almacen.obtenerVehiculos();
        for (Vehiculo vehiculo : listaVehiculos) {
            vehiculo.mostrarBoleta();
        }

        int cantidadVehiculosMayor7Dias = almacen.contarVehiculosArriendoMayor7Dias();
        System.out.println("Cantidad de vehiculos con arriendo mayor o igual a 7 días: " + cantidadVehiculosMayor7Dias);
    }
}
//ETHAN JOSHUA SILVESTRE BADIA
//JAVADOC