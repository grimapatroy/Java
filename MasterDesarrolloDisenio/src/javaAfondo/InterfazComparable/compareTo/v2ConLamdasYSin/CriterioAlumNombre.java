package javaAfondo.InterfazComparable.compareTo.v2ConLamdasYSin;


public  class CriterioAlumNombre implements Criterio<Alumnov2> {


    @Override
    public int compara(Alumnov2 a, Alumnov2 b) {
        return a.getNombre().compareTo(b.getNombre());
    }

    
}
