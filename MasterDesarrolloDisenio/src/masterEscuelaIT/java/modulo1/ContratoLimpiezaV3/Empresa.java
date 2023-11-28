package masterEscuelaIT.java.modulo1.ContratoLimpiezaV3;

public class Empresa {
    private String nombEmpresa;
    private  int anio;

    public ServicesContract capturarDatos() {
        this.nombEmpresa = Console.getInstance().readString("INGRESE NOMBRE DE EMPRESA: ");
        this.anio = Console.getInstance().readInt("INGRSE AÑO : ");
        return   new ServicesContract(this.nombEmpresa,this.anio);
    }

        public int  getYear(){
        return this.anio;
    }

}
