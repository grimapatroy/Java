package javaAfondo.InterfazComparable.compareTo.v1;

public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private int edad;
    private double notaPromedio;
    
    public Alumno(String nombre, int edad , double notaPromedio){
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    @Override
    public int compareTo(Alumno alumno) {
        return this.edad - alumno.edad;
    }

    @Override
    public String toString() {
        return    "Mi nombre es " + this.nombre + " ";
    }

    public String getNombre(){
        return  this.nombre;
    }
}
