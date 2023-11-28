package masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.utilMenu;


import masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.Console;

public class QuitOption extends Option{
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
