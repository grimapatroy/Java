package javaAfondo.InterfazComparable.compareTo.v2ConLamdasYSin;

public class Test2 {
    public static void main(String[] args) {
        Alumnov2 arr[] = {new Alumnov2("JAVIER",25,16.7)
                        ,   new Alumnov2("CARLOS",29,19)
                        ,   new Alumnov2("JUAN",21,19.6)};

//        Utilv2.ordenar(arr,new CriterioAlumNombre());
//        Utilv2.mostrar(arr);
//        Utilv2.ordenar(arr,new CriterioAlumNotaProm());
//        Utilv2.mostrar(arr);

//        determinamos un orden alfabetico ascendente
        Criterio<Alumnov2> c1 = (a,b) -> a.getNombre().compareTo(b.getNombre());
        Utilv2.ordenar(arr,c1);
        Utilv2.mostrar(arr);
//        determinamos un orden ascendente por nota promedio
        Criterio<Alumnov2> c2 = (a,b) -> {
                double diff = a.getNotaProm()-b.getNotaProm();
                return diff>0?1:diff<0?-1:0;
        };
        Utilv2.ordenar(arr,c2);
        Utilv2.mostrar(arr);
    }


}
