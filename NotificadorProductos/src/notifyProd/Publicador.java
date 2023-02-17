
package notifyProd;

/*INTERFAZ QUE REPRESENTA AL OBJETO
 */
public interface Publicador {
    public void addSuscriptor(Suscriptor suscriptor);
    public void borrarSuscriptor(Suscriptor suscriptor);
    public void notificarSuscriptores();
}

