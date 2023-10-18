/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacenvehiculos;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author r3xzz
 */

public class AlmacenVehiculos {
    private List<Vehiculo> vehiculos;

    public AlmacenVehiculos() {
        vehiculos = new ArrayList<>(); // Inicializamos la lista de vehículos aquí
    }

    public boolean agregarVehiculo(Vehiculo vehiculo) {
        // Implementación para validar la patente y agregar el vehículo
        for (Vehiculo v : vehiculos) {
            if (v.getPatente().equals(vehiculo.getPatente())) {
                return false; // La patente ya existe, no se puede agregar
            }
        }
        vehiculos.add(vehiculo);
        return true; // Vehículo agregado con éxito
    }

    public List<Vehiculo> obtenerVehiculos() {
        return vehiculos;
    }

    public int contarVehiculosArriendoMayor7Dias() {
        int contador = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getCantidadDias() >= 7) {
                contador++;
            }
        }
        return contador;
    }
}
