package masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.utilMenu;


import masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.Console;

abstract class Option {

    private String title;

    public Option(String title) {
        this.title = title;
    }

    public abstract void interact();

    public void showTitle(int index) {
        Console.getInstance().writeln(index + ". " + this.getTitle());
    }

    protected String getTitle() {
        return this.title;
    }

}
