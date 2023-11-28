package javaAfondo.InterfazComparable.compareTo.v3InterfazComparator;

import java.util.Comparator;

public class Test3 {

    public static void main(String[] args) {
        Integer arrInt[] = {51,11,2,3,4,24};
        String arrString[] = {"ALAIN","JAVIER","KAKA","PAUL","SAMUEL"};


         Alumnov3 arr[] = {new Alumnov3("KOKO",23,14.2)
                           , new Alumnov3("LOCO",22,15.6)
                            , new Alumnov3("LOLO",25,34.6)
                            };

//    criterio para ordenar ascendente
        Comparator<Integer> c1 = (a,b) ->{return  a-b;};
        Utilv3.ordenar(arrInt,c1);
        Utilv3.imprimir(arrInt);
        System.out.println("---------------------------------");

        //        criterio de precedencia
        Comparator<String> c2 = (a,b) -> a.compareTo(b);
        Utilv3.ordenar(arrString,c2);
        Utilv3.imprimir(arrString);

        System.out.println("---------------------------------");
        Comparator<Alumnov3> c3 = (a,b) -> {
            double diff = a.getNotaProm()-b.getNotaProm();
            return diff>0?1:diff<0?-1:0;
                                                        };
        Utilv3.ordenar(arr,c3);
        Utilv3.imprimir(arr);
    }

}
