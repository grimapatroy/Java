package javaAfondo.InterfazComparable.comunicador;

public class TelefonoCelular  extends Telefono implements Comunicador{

    public void enviarMensaje(String mensaje){
        System.out.printf("Soy una telefono celular estoy enviado un mensaje pitpit ");
    }


}
