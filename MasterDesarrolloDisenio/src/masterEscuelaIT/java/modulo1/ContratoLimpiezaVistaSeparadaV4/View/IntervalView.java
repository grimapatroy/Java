package masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View;


import masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.Model.Interval;

public class IntervalView {
    private Interval interval;

    public IntervalView(Interval interval){
        this.interval = interval;
    }

        public void read(){
        boolean error;
        do {
            this.interval.setMin( Console.getInstance().readDouble("Dame el mínimo del intervalo: "));
            this.interval.setMax( Console.getInstance().readDouble("Dame el máximo del intervalo: ") );
            error = this.interval.getMin() <= this.interval.getMax();
            if (error) {
                Console.getInstance().writeln("El minimo no puede ser mayor que el maximo");
            }
        } while (error);
    }

    public void writeln() {
        Console.getInstance().writeln(this.interval.toString());
    }


}
