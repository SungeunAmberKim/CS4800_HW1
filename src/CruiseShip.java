public class CruiseShip extends  Ship{
    private int maxPassenger;

    public CruiseShip(){
        super();
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }
    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    @Override
    public void funcPrint(){
        System.out.println("Name: " + this.shipName + ", maximum number of passengers: " + this.maxPassenger);
    }

}

