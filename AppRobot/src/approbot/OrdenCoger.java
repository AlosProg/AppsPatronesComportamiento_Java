
package approbot;

/*CLASE QUE REPRESENTA LA ORDEN CONCRETA COGER
 */
public class OrdenCoger implements OrdenRobot {

    @Override
    public void ejecutar(Robot mirobot) {
       if (mirobot.getPinzas()==2){
           System.out.println("El robot está cogiendo la caja");
       }
       else if (mirobot.getPinzas()==1){
           System.out.println("El robot está empujando la caja");
       }
    }
}
