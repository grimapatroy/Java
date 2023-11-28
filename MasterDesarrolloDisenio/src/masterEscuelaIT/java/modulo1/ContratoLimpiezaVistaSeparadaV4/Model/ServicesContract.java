package masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.Model;

public class ServicesContract {

    private String name;
    private Interval[] intervals;

    private  int year;
    private final Interval PRESET_INTERVAL = new Interval(8.0, 12.0);
    private final double PRESET_COST_PER_HOUR = 70.0;
    private final double EXTRAORDINARY_COST_PER_HOUR = 90.0;

    public ServicesContract(String name, int year) {
        this.name = name;
        this.year = year;
        this.intervals = new Interval[new Date(1, 1, year).DAYS_PER_YEAR];
        for (int i = 0; i < intervals.length; i++) {
            this.intervals[i] = this.PRESET_INTERVAL.clone();
        }
    }
    public  ServicesContract(){
    }

    public void cancel(Date date) {
        this.intervals[date.daysElapsedYear()] = null;
    }

    public void enlarge(Date date, double scale) {
        this.intervals[date.daysElapsedYear()].scale(scale);
    }

    public void shift(Date date, double shiftment) {
        this.intervals[date.daysElapsedYear()].shift(shiftment);
    }


    public double getCost() {
        double cost = 0.0;
        for (Interval interval : this.intervals) {
            if (interval != null) {
                double presetHours = 0.0;
                Interval intersection = interval.intersection(PRESET_INTERVAL);
                if (intersection != null) {
                    presetHours = intersection.length();
                    cost += presetHours * PRESET_COST_PER_HOUR;
                }
                cost += (interval.length() - presetHours)* EXTRAORDINARY_COST_PER_HOUR;
            }
        }
        return cost;
    }

    public String getName() {
        return this.name;
    }


    public int getYear() {
        return this.year;
    }

    public int getIntervalslength() {
        return this.intervals.length;
    }

    public Interval intervalIndex(int i) {
        return this.intervals[i];
    }
}
