public class Assets {
    private String description;
    private String dateAcquired;
    private double originalCost;

    public Assets(){}

    public Assets(String description, String dateAcquired, double originalCost){
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
        System.out.println("You look like you need an asset...!");
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
    //endregion

    public double getValue(){
        return originalCost;
    }

}
