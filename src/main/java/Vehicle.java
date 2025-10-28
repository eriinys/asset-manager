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


}
