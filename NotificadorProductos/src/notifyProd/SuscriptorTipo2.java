
package notifyProd;

/*CLASE QUE REPRESENTA A UN OBSERVADOR CONCRETO
 */
public class SuscriptorTipo2 implements Suscriptor {

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Gracias por el aviso, iré a comprarlo a lo largo de la semana");
    }
}
