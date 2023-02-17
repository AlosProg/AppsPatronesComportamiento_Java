
package ichat;

/*CLASE QUE REPRESENTA AL MEDIADOR CONCRETO E IMPLEMENTA A LA INTERFAZ MEDIADOR
 */
public class MediadorConcreto implements Mediador {
    
    private UsuarioConcreto1 user1;
    private UsuarioConcreto2 user2;

    public void setUser1(UsuarioConcreto1 user1) {
        this.user1 = user1;
    }

    public void setUser2(UsuarioConcreto2 user2) {
        this.user2 = user2;
    }
    
    @Override
    public void notificar(String mensaje, Usuario usuario) {
        if (usuario == user1){
            user2.recibir(mensaje);
        }
        else if (usuario == user2){
            user1.recibir(mensaje);
        }
    }
}
