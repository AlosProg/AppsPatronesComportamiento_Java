
package approbot;

/*CLASE UTILIZADA POR EL CLIENTE QUE SERA EL RECEPTOR DE ORDENES
 */
public class ReceptorOrden {

    public void ejecutar(OrdenRobot orden,Robot mirobot){
        orden.ejecutar(mirobot);
    }
}
