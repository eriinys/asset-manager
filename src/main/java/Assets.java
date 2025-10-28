public class Assets {
    private String description;
    private String dateAcquired;
    private double originalCost;
    private static String company = "YUU";

    public Assets(){}

    public Assets(String description, String dateAcquired, double originalCost){
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    //region getters
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public String getDateAcquired(){
        return dateAcquired;
    }
    public void setDateAcquired(String dateAcquired){
        this.dateAcquired = dateAcquired;
    }

    public double getOriginalCost(){
        return originalCost;
    }
    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    public static String getCompany(){
        return company;
    }
    //endregion

    public double getValue(){
        return originalCost;
    }

    public void display(){
        System.out.printf("""
                Description: %s
                Date Acquired: %s
                Original Cost Paid: $%.2f
                Current Value: $%.2f%n
                """, description, dateAcquired, originalCost, getValue());
    }
}
