package masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View;


import masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.Model.Date;
import masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.Model.ServicesContract;

public class ServicesContractView {
    private ServicesContract servicesContract;

    public ServicesContractView(ServicesContract servicesContract){
        this.servicesContract = servicesContract;
    }

        public void writeln() {
        Console.getInstance().writeln("Contrato de limpieza: " +  this.servicesContract.getName() + "-" + this.servicesContract.getYear());
        Date date = new Date(1, 1, this.servicesContract.getYear());
        for (int i = 0; i < this.servicesContract.getIntervalslength(); i++) {
            Console.getInstance().write("(" + (i + 1) + "º) " + date + " - ");
            if (   this.servicesContract.intervalIndex(i) == null) {
                Console.getInstance().writeln("Cancelado");
            } else {
                Console.getInstance().writeln(this.servicesContract.intervalIndex(i).toString());
            }
            date = date.next();
        }
    }

}
