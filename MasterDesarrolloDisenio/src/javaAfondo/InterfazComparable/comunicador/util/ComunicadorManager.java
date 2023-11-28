package javaAfondo.InterfazComparable.comunicador.util;

import javaAfondo.InterfazComparable.comunicador.Comunicador;
import javaAfondo.InterfazComparable.comunicador.PalomaMensaje;

public class ComunicadorManager {

    public static Comunicador crearComunicador(){
        return new PalomaMensaje();
    }


}
