package javaAfondo.InterfazComparable.compareTo.v1;

public class Util {

    public static <T extends Comparable<T>> void ordenar (T arr[]){
        for (int n=0;n<arr.length;n++) {
            for (int i =0; i < arr.length-1; i++) {
                if (arr[i + 1].compareTo(arr[i]) < 0) {
                    T aux = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = aux;
                }
            }
        }
    }


}
