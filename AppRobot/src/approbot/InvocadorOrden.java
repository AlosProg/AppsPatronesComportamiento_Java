
package approbot;

import java.util.ArrayList;
import java.util.List;

/*CLASE QUE REPRESENTA AL INVOCADOR DE ORDENES
 */
public class InvocadorOrden implements OrdenRobot {
    
    private List<OrdenRobot> lista = new ArrayList<OrdenRobot>();//creamos una lista de ordenes
    
    public void addOrden (OrdenRobot orden){ //metodo que aniade ordenes
        lista.add(orden); 
    }

    @Override
    public void ejecutar(Robot mirobot) { //metodo que pide al receptor que ejecute las ordenes de la lista
        
        for (OrdenRobot orden : lista ){
            orden.ejecutar(mirobot);
        }
        lista.clear();
    }
}
