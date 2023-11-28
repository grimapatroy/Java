package javaAfondo.InterfazComparable.comunicador;

import javaAfondo.InterfazComparable.comunicador.util.ComunicadorManager;

public class MiAppDeMensajes {

    public static void main(String[] args) {
        Comunicador c = ComunicadorManager.crearComunicador();
        c.enviarMensaje("Hola, este es mi mensaje");
    }

}
