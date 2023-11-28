package masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.utilMenu;


import masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.Empresa;
import masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.ServicesContract;

public class ModelIterativeMenu extends  IterativeMenu{
    private ServicesContract servicesContract;
    private Empresa empresa;

    public ModelIterativeMenu(ServicesContract servicesContract , Empresa empresa) {
        super("MENU ITERATIVO");
        this.servicesContract = servicesContract;
        this.empresa = empresa;
    }

    @Override
    protected void addOptions() {
        this.add(new ListModelOption(this.servicesContract,this.empresa));
        this.add(new CancelarModelOption(this.servicesContract,this.empresa));
        this.add(new CambiarRangoFechaModelOption(this.servicesContract , this.empresa));
        this.add(new AlargarRangoHoraFechaModelOption(this.servicesContract, this.empresa));
//        this.add(new InverseListModelOption(this.servicesContract,this.empresa));
    }
}
