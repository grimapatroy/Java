package javaAfondo.InterfazComparable.compareTo.v2ConLamdasYSin;

public class CriterioAlumNotaProm implements Criterio<Alumnov2>{
    @Override
    public int compara(Alumnov2 a, Alumnov2 b) {
        double diff = a.getNotaProm() - b.getNotaProm();
        return diff>0?1:diff<0?-1:0;
    }
}
