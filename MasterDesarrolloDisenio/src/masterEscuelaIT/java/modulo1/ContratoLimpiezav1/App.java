package masterEscuelaIT.java.modulo1.ContratoLimpiezav1;

public class App {
    public static void main(String[] args) {
        new App().run();
    }

    public void run (){
        Console.getInstance().writeln("BIENVENIDOS A LA GESTION DE CONTRATOS POR FECHAS");
        new Menu().runMenu();
    }
}


