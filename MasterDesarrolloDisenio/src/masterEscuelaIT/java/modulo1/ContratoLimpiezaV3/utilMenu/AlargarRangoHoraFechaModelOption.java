package masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.utilMenu;


import masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.Console;
import masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.Date;
import masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.Empresa;
import masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.ServicesContract;

public class AlargarRangoHoraFechaModelOption extends ModelOption {
    public AlargarRangoHoraFechaModelOption(ServicesContract servicesContract
            , Empresa empresa) {
        super("ALARGAR RANGO DE HORAS PARA EL CONTRATO",
                servicesContract,
                empresa);
    }

    @Override
    public void interact() {
        this.servicesContract = this.empresa.capturarDatos();
        double  interval = Console.getInstance().readDouble("INGRESA LA ESCALA");
        this.servicesContract.enlarge(new Date(new Date().caputureDay(),new Date().captureMonth(),this.empresa.getYear()),interval);
        this.servicesContract.writeln();
        Console.getInstance().writeln("Costo anual del contrato: "+this.servicesContract.getCost());
    }
}
