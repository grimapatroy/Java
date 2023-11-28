package masterEscuelaIT.java.modulo1.ContratoLimpiezaV2.utilMenu;

import masterEscuelaIT.java.modulo1.ContratoLimpiezaV2.Console;
import masterEscuelaIT.java.modulo1.ContratoLimpiezaV2.Date;
import masterEscuelaIT.java.modulo1.ContratoLimpiezaV2.Empresa;
import masterEscuelaIT.java.modulo1.ContratoLimpiezaV2.ServicesContract;

public class CambiarRangoFechaModelOption extends ModelOption {
    public CambiarRangoFechaModelOption(ServicesContract servicesContract,
                                        Empresa empresa) {
        super("CAMBIAR RANGO DE FECHAS Y HORAS EN EL CONTRATO",
                servicesContract,  empresa);
    }

    @Override
    public void interact() {
        double intervalo = Console.getInstance().readDouble("INGRESE ESCALA: ");
        this.servicesContract = this.empresa.capturarDatos();
        this.servicesContract.shift(new Date(new Date().caputureDay(),new Date().captureMonth(),this.empresa.getYear()),intervalo);
        this.servicesContract.writeln();
        Console.getInstance().writeln("Coste anuel del contrato: "+this.servicesContract.getCost());
    }
}
