
package notifyProd;

/*CLASE QUE REPRESENTA A UN OBSERVADOR CONCRETO
 */
public class SuscriptorTipo3 implements Suscriptor {
    @Override
    public void actualizar(String mensaje) {
        System.out.println("Me interesa su aparato, pero tardaré en ir a comprarlo más de una semana");
    }
}
