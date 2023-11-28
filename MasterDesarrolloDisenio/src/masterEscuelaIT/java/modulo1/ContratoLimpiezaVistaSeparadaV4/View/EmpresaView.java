package masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View;


import masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.Model.ServicesContract;

public class EmpresaView {
    private String nombEmpresa;
    private  int anio;


    public ServicesContract capturarDatos(){
        this.ingresarDatos();
        return   new ServicesContract(this.nombEmpresa,this.anio);
    }
    private void ingresarDatos() {
        this.nombEmpresa = Console.getInstance().readString("INGRESE NOMBRE DE EMPRESA: ");
        this.anio = Console.getInstance().readInt("INGRSE AÑO : ");
    }

        public int  getYear(){
        return this.anio;
    }

}
