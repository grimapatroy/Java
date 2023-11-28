package masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.utilMenu;


import masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.Console;
import masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.Date;
import masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.Empresa;
import masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.ServicesContract;

public class CancelarModelOption extends ModelOption {
    public CancelarModelOption(ServicesContract servicesContract, Empresa empresa) {
        super("Cancelar Fecha de Contrato",servicesContract , empresa);
    }

    @Override
    public void interact() {
        this.servicesContract = this.empresa.capturarDatos();
        this.servicesContract.cancel(new Date(new Date().caputureDay() ,
                new Date().captureMonth(),
                this.empresa.getYear()));
        this.servicesContract.writeln();
        Console.getInstance().writeln("Costo Anual del contrato es : " +this.servicesContract.getCost());
    }
}
