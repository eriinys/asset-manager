public class House extends Assets{
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House (String description, String dateAcquired, double originalCost, int condition, int squareFoot, int lotSize){
        super(description, dateAcquired, originalCost);
        this.condition = condition;
        this.squareFoot = squareFoot;
        this. lotSize = lotSize;
    }

    //region getters
    public int getCondition() {
        return condition;
    }
    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }
    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }
    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
    //endregion

    @Override
    public double getValue() {
        double pricePerSqFt = getOriginalCost() / squareFoot;
        if (pricePerSqFt >= 180){
            condition = 1;
        } else if (pricePerSqFt >= 130 && pricePerSqFt < 180) {
            condition = 2;
        } else if (pricePerSqFt >= 90 && pricePerSqFt < 130) {
            condition = 3;
        } else if (pricePerSqFt >= 80 && pricePerSqFt < 90) {
            condition = 4;
        }
        double lotPrice = lotSize * 0.25;
        return getOriginalCost() + lotPrice;
    }
}
