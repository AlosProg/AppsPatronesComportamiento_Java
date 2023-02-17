
package ichat;

/*INTERFAZ QUE REPRESENTARÁ AL MEDIADOR
 */
public interface Mediador {
    
    public abstract void notificar(String mensaje, Usuario usuario);
}
