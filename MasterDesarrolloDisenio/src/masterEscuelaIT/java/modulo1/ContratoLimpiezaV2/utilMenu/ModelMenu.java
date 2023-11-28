package masterEscuelaIT.java.modulo1.ContratoLimpiezaV2.utilMenu;


import masterEscuelaIT.java.modulo1.ContratoLimpiezaV2.Empresa;
import masterEscuelaIT.java.modulo1.ContratoLimpiezaV2.ServicesContract;

public class ModelMenu extends Menu {

    private ServicesContract servicesContract;
    private Empresa empresa;



    public ModelMenu(ServicesContract servicesContract, Empresa empresa) {
        super("Model Menu Basico");
        this.servicesContract = servicesContract;
        this.empresa = empresa;
    }


    protected void addOptions() {
        this.add(new ListModelOption(this.servicesContract,this.empresa));
        this.add(new CancelarModelOption(this.servicesContract,this.empresa));
        this.add(new CambiarRangoFechaModelOption(this.servicesContract , this.empresa));
        this.add(new AlargarRangoHoraFechaModelOption(this.servicesContract, this.empresa));
//        this.add(new InverseListModelOption(this.servicesContract,this.empresa));
//        this.add(new FindModelOption(this.servicesContract,this.empresa));
    }

}
