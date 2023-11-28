package masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View;


import masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.Model.Date;

public class DateView {
    private Date date;

    public DateView(Date date){
        this.date = date;
    }
    public DateView(){
    }
        public int caputureDay() {
        boolean error;
        int day;
        do {
            day = Console.getInstance().readInt("INGRESA DIA QUE SE VA A CANCELAR (1 al 30): ");
            error  = (day > 0 && day <= this.date.DAYS_PER_MONTH);
        }while ( !error );
        return day;
    }

    public int captureMonth() {
        boolean error ;
        int month;
        do {
            month = Console.getInstance().readInt("INGRESA MES QUE SE VA A CANCELAR(1 - 12): ");
            error = month <= this.date.MONTHS_PER_YEAR && month >= 1;
        }while(!error);
        return month;
    }

}
