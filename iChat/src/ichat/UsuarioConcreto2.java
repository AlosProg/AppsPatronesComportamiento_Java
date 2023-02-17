
package ichat;

/*CLASE QUE REPRESENTA A UN USUARIO CONCRETO
 */
public class UsuarioConcreto2 extends Usuario {
    
    public UsuarioConcreto2(Mediador mediador) {
        super(mediador);
    }
    
    @Override
    public void notificar(String mensaje) {
        mediador.notificar(mensaje, this);
        
    }
    @Override
    public void recibir(String mensaje) {
        System.out.println("Usuario2 recibe un mensaje: "+ mensaje);
    }
    
}
