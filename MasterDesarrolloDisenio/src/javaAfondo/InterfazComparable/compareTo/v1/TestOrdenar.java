package javaAfondo.InterfazComparable.compareTo.v1;

public class TestOrdenar {
    public static void main(String[] args) {
        Alumno arrAlumnos[]={new Alumno("GABO",25,17.7)
                      ,new Alumno("SANDRO",45,14.7)
                      ,new Alumno("LILI",15,15.7)  };

        Integer arrEnteros[] = {3,1,2};
        String arrCadenas[] = {"MESA","SILLA","BANCO"};

        Util.ordenar(arrAlumnos);
        muestraArray(arrAlumnos);
        Util.ordenar(arrCadenas);
        muestraArray(arrCadenas);
        Util.ordenar(arrEnteros);
        muestraArray(arrEnteros);
    }


    private static <T> void muestraArray(T arr[]){
        for (T t:arr) {
            System.out.println(t);
        }
    }

}
