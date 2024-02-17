public class Ship {
    public String shipName;
    public String shipYearBuilt;

    public Ship(){}

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipYearBuilt() {
        return shipYearBuilt;
    }

    public void setShipYearBuilt(String shipYearBuilt) {
        this.shipYearBuilt = shipYearBuilt;
    }

    public void funcPrint(){
        System.out.println("Name: " + this.shipName + ", year built in: " + this.shipYearBuilt);
    }
}
