
package approbot;


public class Cliente {

    /*AA3 PRUEBAS DEL PATRON COMMAND
     */
    public static void main(String[] args) {
    
        InvocadorOrden io = new InvocadorOrden();//se crea objeto invocador de tareas
        
        io.addOrden(new OrdenMover()); //se van anadiendo las tareas a la lista de tareas...
        io.addOrden(new OrdenCoger());
        io.addOrden(new OrdenMover());
        io.addOrden(new OrdenSoltar());
        
        ReceptorOrden receptor = new ReceptorOrden();//se crea un objeto receptor de las tareas
        Robot r = new Robot(2,"piernas");//se crea un robot
        receptor.ejecutar(io, r);//se pide al receptor que ejecute las ordenes invocadas al robot
        
        System.out.println("*********************");
        
        InvocadorOrden io2 = new InvocadorOrden();//se crea objeto invocador de tareas
        io2.addOrden(new OrdenMover()); //se van anadiendo las tareas a la lista de tareas...
        io2.addOrden(new OrdenCoger());
        io2.addOrden(new OrdenMover());
        io2.addOrden(new OrdenSoltar());
        
        ReceptorOrden receptor2 = new ReceptorOrden();//se crea un objeto receptor de las tareas
        Robot r2 = new Robot(1,"ruedas");//se crea un robot
        receptor2.ejecutar(io2, r2);
        
        
    }
}
