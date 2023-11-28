package javaAfondo.InterfazComparable.comunicador;

public class Telegrafo extends Antiguedad implements Comunicador{

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.printf("Soy un viejo telegrafo estoy enviado un mensaje tic tic tic ");
    }
}
