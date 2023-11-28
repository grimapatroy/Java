package javaAfondo.InterfazComparable.comunicador;

public class PalomaMensaje extends Paloma implements Comunicador{

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.printf("Soy una Paloma mensaje estoy enviado un mensaje gut gut goo ");
    }


}
