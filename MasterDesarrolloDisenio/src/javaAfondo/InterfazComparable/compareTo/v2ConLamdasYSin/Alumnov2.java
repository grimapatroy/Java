package javaAfondo.InterfazComparable.compareTo.v2ConLamdasYSin;

public class Alumnov2 {
    private String nombre;
    private int edad;
    private double notaPromedio;

    public Alumnov2(String nombre, int edad , double notaPromedio){
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    @Override
    public String toString() {
        return    this.nombre + " "+ this.edad + " " + this.notaPromedio;
    }

    public String getNombre(){
        return  this.nombre;
    }

    public Double getNotaProm() {
        return this.notaPromedio;
    }
}
