package masterEscuelaIT.java.modulo1.ContratoLimpiezav1;

public class Menu {
    private static final String[] TITULOS = new String[]{
            "\n1. MOSTRAR COSTO ANUAL",
            "\n2. CANCELAR UNA FECHA DENTRO DEL CONTRATO",
            "\n3. CAMBIAR EL RANGO DE INTERVALO DE HORA DE UNA FECHA",
            "\n4. ALARGAR EL RANGO DE INTERVALO DE HORA DE UNA FECHA",
            "\n5. SALIR",
    };
    private static final Interval OPCIONES = new Interval(1, 5);


    public void mostrar() {
        for (String titulo : TITULOS) {
            Console.getInstance().writeln(titulo);
        }
    }

    public int getOpcion() {
        int op;
        boolean error;
        do {
            op = Console.getInstance().readInt("INGRESE OPCION DEL [1-5]: ");
            error = !OPCIONES.includes(op);
            if (error) {
                Console.getInstance().writeln("Error!!!!, la opcion debe ser del 1 al 5");
            }
        } while (error);
        return op;
    }

    private ServicesContract setGuardarEmpresaAnio(String EMPRESA, int YEAR) {
        ServicesContract servicesContract = new ServicesContract(EMPRESA, YEAR);
        return servicesContract;
    }

    private void getOpcionMostrarCostoAnual(String EMPRESA, int YEAR) {
        ServicesContract servicesContract = this.setGuardarEmpresaAnio(EMPRESA, YEAR);
        servicesContract.writeln();
        Console.getInstance().writeln("Coste anual del contrato: " + servicesContract.getCost());
    }

    private int capturarDia() {
        int dia = Console.getInstance().readInt("INGRESA DIA: ");
        return dia;
    }
    private int capturarMes() {
        int mes = Console.getInstance().readInt("INGRESA MES: ");
        return mes;
    }

    private void getOpcionCancelarFechaDentroContrato(String EMPRESA, int YEAR) {
        ServicesContract servicesContract = this.setGuardarEmpresaAnio(EMPRESA, YEAR);
        servicesContract.cancel(new Date(this.capturarDia(), this.capturarMes(), YEAR));
        servicesContract.writeln();
        Console.getInstance().writeln("Coste anual del contrato: " + servicesContract.getCost());
    }

    private void getOpcionCambiarRangoHoraFecha(String EMPRESA, int YEAR) {
        double interval = Console.getInstance().readDouble("INGRESA LA ESCALA");
        ServicesContract servicesContract = this.setGuardarEmpresaAnio(EMPRESA, YEAR);
        servicesContract.shift(new Date(this.capturarDia(), this.capturarMes(), YEAR), interval);
        servicesContract.writeln();
        Console.getInstance().writeln("Coste anual del contrato: " + servicesContract.getCost());
    }

    private void getOpcionAlargarRangoHoraFecha(String EMPRESA, int YEAR) {
        ServicesContract servicesContract = this.setGuardarEmpresaAnio(EMPRESA, YEAR);
        double  interval = Console.getInstance().readDouble("INGRESA LA ESCALA");
        servicesContract.enlarge(new Date(this.capturarDia(), this.capturarMes(), YEAR), interval);
        servicesContract.writeln();
        Console.getInstance().writeln("Coste anual del contrato: " + servicesContract.getCost());
    }

    public void runMenu() {
        final int YEAR = Console.getInstance().readInt("INGRESE AÑO: ");
        final String EMPRESA = Console.getInstance().readString("INGRESE NOMBRE DE LA EMPRESA: ");
        int op ;
        do {
            this.mostrar();
            op = this.getOpcion();
            switch (op) {
                case 1:
                    this.getOpcionMostrarCostoAnual(EMPRESA, YEAR);
                    break;
                case 2:
                    this.getOpcionCancelarFechaDentroContrato(EMPRESA, YEAR);
                    break;
                case 3:
                    this.getOpcionCambiarRangoHoraFecha(EMPRESA, YEAR);
                    break;
                case 4:
                    this.getOpcionAlargarRangoHoraFecha(EMPRESA, YEAR);
                    break;
                case 5:
                    break;
            }
        }while (op <= 4);
    }


}