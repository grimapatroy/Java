package masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.utilMenu;


import masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.Console;
import masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.Empresa;
import masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.ServicesContract;

class ListModelOption extends ModelOption {

    public ListModelOption(ServicesContract servicesContract , Empresa empresa) {
        super("Listar Costo Anual", servicesContract ,empresa);
    }

    public void interact() {
//        programa lo que va hacer el metodo !!
        this.servicesContract = this.empresa.capturarDatos();
        this.servicesContract.writeln();
        Console.getInstance().writeln("Coste anual del contrato: " + this.servicesContract.getCost());
    }


}
