import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vehicle extends Assets{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, int odometer, int year, String makeModel) {
        super(description, dateAcquired, originalCost); //inherits constructor from Assets
        this.odometer = odometer;
        this.year = year;
        this.makeModel = makeModel;
    }

    //region getters
    public String getMakeModel() {
        return makeModel;
    }
    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }
    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    //endregion

    @Override
    public double getValue(){
        LocalDate now = LocalDate.now();
        double age = (Double.parseDouble(getDateAcquired()) - year) + now.getYear();
        double rate;
        double reducedValue;
        if (age <= 3) {
            rate = 0.03;
            reducedValue = getOriginalCost() - (getOriginalCost() * (age * rate));
        } else if (age <=6 && age >= 4) {
            rate = 0.06;
            reducedValue = getOriginalCost() - (getOriginalCost() * (age * rate));
        } else if (age <=10 && age >= 7) {
            rate = 0.08;
            reducedValue = getOriginalCost() - (getOriginalCost() * (age * rate));
        } else {
            reducedValue = getOriginalCost() - 1000;
        }

        if (!makeModel.toLowerCase().contains("honda") && !makeModel.toLowerCase().contains("toyota")) {
            if (odometer > 100000) {
                reducedValue -= reducedValue - (reducedValue * 0.25);
            }
        }
        return reducedValue;
    }

}
