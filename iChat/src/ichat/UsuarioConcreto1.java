
package ichat;

/*CLASE QUE REPRESENTA A UN USUARIO CONCRETO
 */
public class UsuarioConcreto1 extends Usuario {

    public UsuarioConcreto1(Mediador mediador) {
        super(mediador);
    }
    
    @Override
    public void notificar(String mensaje) {
        mediador.notificar(mensaje, this);
        
    }
    @Override
    public void recibir(String mensaje) {
        System.out.println("Usuario1 recibe un mensaje: "+ mensaje);
    }
}
