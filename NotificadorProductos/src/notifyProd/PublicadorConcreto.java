
package notifyProd;

import java.util.ArrayList;
import java.util.List;

/*CLASE QUE REPRESENTA AL OBJETO CONCRETO Y QUE PUBLICARA LAS ACTUALIZACIONES
 */
public class PublicadorConcreto implements Publicador {
    
    private List<Suscriptor> clientes = new ArrayList<>();//guardamos los clientes suscriptores en un Array

    @Override
    public void addSuscriptor(Suscriptor cliente) {// aniadimos un cliente a la lista
        clientes.add(cliente);
    }
    @Override
    public void borrarSuscriptor(Suscriptor cliente) {// borramos un cliente de la lista
        clientes.remove(cliente);
    }

    @Override
    public void notificarSuscriptores() {
        clientes.forEach((cliente) -> {
            cliente.actualizar("Disponemos del aparato requerido por usted");
        });
    }
}

