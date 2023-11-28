package masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.Model;

import masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.Abstract.Option;
import masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.Console;

public class QuitOption extends Option {
    private  boolean executed;
    public QuitOption() {
        super("SALIR");
        this.executed = false;
    }

    @Override
    public void interact() {
        this.executed = true;
        Console.getInstance().writeln("!!!!ADIOS¡¡¡¡¡");
    }

    public boolean isExecuted() {
        return this.executed;
    }
}
