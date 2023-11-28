package javaAfondo.InterfazComparable.compareTo.v3InterfazComparator;

public class Alumnov3 {
    private String nombre;
    private int edad;
    private double notaPromedio;

    public Alumnov3(String nombre, int edad , double notaPromedio){
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
