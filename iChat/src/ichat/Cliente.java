
package ichat;


public class Cliente {

    /*AA3 PATRON MEDIATOR PRUEBAS
     */
    public static void main(String[] args) {
        MediadorConcreto medcon = new MediadorConcreto();// se crea un objeto mediador
        
        UsuarioConcreto1 user1 = new UsuarioConcreto1(medcon);// se crean los usuarios...
        UsuarioConcreto2 user2 = new UsuarioConcreto2(medcon);
        
        medcon.setUser1(user1);//se registran los usuarios en mediador
        medcon.setUser2(user2);
        
        user1.notificar("Hola, ¿quedamos luego?");//el usuario 1 envía un mensaje
        user2.notificar("Hola, me parece bien quedar");//el usuario 2 envía otro mensaje
    }
}
