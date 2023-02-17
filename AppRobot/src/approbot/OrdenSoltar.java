
package approbot;

/*CLASE QUE REPRESENTA LA ORDEN CONCRETA SOLTAR
 */
public class OrdenSoltar implements OrdenRobot {

    @Override
    public void ejecutar(Robot mirobot) {
        if (mirobot.getPinzas()==2){
           System.out.println("El robot está soltando la caja");
        }
        else if (mirobot.getPinzas()==1){
           System.out.println("El robot está dejando de empujar la caja");
       }
    }
}
