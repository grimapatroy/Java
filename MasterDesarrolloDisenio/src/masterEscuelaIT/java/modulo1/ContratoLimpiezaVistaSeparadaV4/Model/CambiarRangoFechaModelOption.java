package masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.Model;


import masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.Abstract.ModelOption;
import masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.Console;
import masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.DateView;
import masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.EmpresaView;
import masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.ServicesContractView;

public class CambiarRangoFechaModelOption extends ModelOption {
    public CambiarRangoFechaModelOption(ServicesContract servicesContract,
                                        EmpresaView empresaView) {
        super("CAMBIAR RANGO DE FECHAS Y HORAS EN EL CONTRATO",
                servicesContract, empresaView);
    }

    @Override
    public void interact() {
        double intervalo = Console.getInstance().readDouble("INGRESE ESCALA: ");
        this.servicesContract = this.empresaView.capturarDatos();
        this.servicesContract.shift(new Date(new DateView().caputureDay(),new DateView().captureMonth(),this.empresaView.getYear()),intervalo);
        new ServicesContractView(this.servicesContract).writeln();
        Console.getInstance().writeln("Coste anuel del contrato: "+this.servicesContract.getCost());
    }
}
