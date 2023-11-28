package masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.Model;


import masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.Abstract.IterativeMenu;
import masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.EmpresaView;

public class ModelIterativeMenu extends IterativeMenu {
    private ServicesContract servicesContract;
    private EmpresaView empresaView;

    public ModelIterativeMenu(ServicesContract servicesContract , EmpresaView empresaView) {
        super("MENU ITERATIVO");
        this.servicesContract = servicesContract;
        this.empresaView = empresaView;
    }

    @Override
    protected void addOptions() {
        this.add(new ListModelOption(this.servicesContract,this.empresaView));
        this.add(new CancelarModelOption(this.servicesContract,this.empresaView));
        this.add(new CambiarRangoFechaModelOption(this.servicesContract , this.empresaView));
        this.add(new AlargarRangoHoraFechaModelOption(this.servicesContract, this.empresaView));
//        this.add(new InverseListModelOption(this.servicesContract,this.empresa));
    }
}
