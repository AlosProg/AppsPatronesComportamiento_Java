
package notifyProd;

/*CLASE QUE REPRESENTA A UN OBSERVADOR CONCRETO
 */
public class SuscriptorTipo1 implements Suscriptor {

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Iré a comprarlo en uno o dos días");
    }
}

