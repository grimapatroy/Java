package javaAfondo.InterfazComparable.compareTo.v2ConLamdasYSin;

public class Utilv2 {
    public static <T> void ordenar (T arr[] , Criterio<T> cr){
        for (int n=0;n<arr.length;n++) {
            for (int i =0; i < arr.length-1; i++) {
                if (cr.compara(arr[i],arr[i + 1]) > 0) {
                    T aux = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = aux;
                }
            }
        }
    }

    public static <T> void mostrar(T arr[]){
        for (T t:arr) {
            System.out.println(t);
        }
    }
}
