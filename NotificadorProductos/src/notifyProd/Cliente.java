
package notifyProd;


public class Cliente {

    /*AA3 PRUEBAS DEL PATRÓN OBSERVER
     */
    public static void main(String[] args) {
        PublicadorConcreto tiendaElectronica = new PublicadorConcreto();
        
        SuscriptorTipo1 cliente1 = new SuscriptorTipo1();//creamos un cliente del tipo 1
        SuscriptorTipo2 cliente2 = new SuscriptorTipo2();//creamos un cliente del tipo 2
        SuscriptorTipo3 cliente3 = new SuscriptorTipo3();//creamos un cliente del tipo 3
        
        tiendaElectronica.addSuscriptor(cliente1);//aniadimos el cliente 1 a nuestra suscripcion
        tiendaElectronica.addSuscriptor(cliente2);//aniadimos el cliente 1 a nuestra suscripcion
        
        tiendaElectronica.notificarSuscriptores();//se notifica a los clientes que el producto ya llegó
        
        tiendaElectronica.borrarSuscriptor(cliente2);// un cliente decide no seguir en la suscripcion
        
        tiendaElectronica.addSuscriptor(cliente3);//un nuevo cliente se aniade a nuestra suscripcion
        
        tiendaElectronica.notificarSuscriptores();//se vuelve a notificar a los clientes suscritos el producto
    }
}
