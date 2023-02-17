
package ichat;

/*CLASE ABSTRACTA QUE REPRESENTARÁ AL COLEGA
 */
public abstract class Usuario {
    protected Mediador mediador;

    public Usuario(Mediador mediador) {
        this.mediador = mediador;
    }
    
    public abstract void notificar(String mensaje);
    public abstract void recibir(String mensaje);
}
