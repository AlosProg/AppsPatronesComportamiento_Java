
package approbot;

/*CLASE QUE REPRESENTA LA ORDEN CONCRETA MOVER
 */
public class OrdenMover implements OrdenRobot {

    @Override
    public void ejecutar(Robot mirobot) {
        if ("ruedas".equals(mirobot.getPartedeabajo())){
            System.out.println("El robot está rodando");
        }
        else if("piernas".equals(mirobot.getPartedeabajo())){
            System.out.println("El robot está caminando");
        }
    }
}


