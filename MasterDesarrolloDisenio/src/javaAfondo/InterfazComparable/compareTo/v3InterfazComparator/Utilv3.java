package javaAfondo.InterfazComparable.compareTo.v3InterfazComparator;

import java.util.Comparator;

public class Utilv3 {
    public static <T> void ordenar(T arr[], Comparator<T> cp){
        for (int n=0;n<arr.length;n++) {
            for (int i =0; i < arr.length-1; i++) {
                if (cp.compare(arr[i],arr[i + 1]) > 0) {
                    T aux = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = aux;
                }
            }
        }
    }

    public static <T> void imprimir(T arr[]){
        for (T t:arr) {
            System.out.println(t);
        }
    }
}
