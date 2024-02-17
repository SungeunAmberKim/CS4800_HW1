public class CargoShip extends Ship {
    private int cargoCapInTon;

    public CargoShip(){
        super();
    }

    public int getCargoCapInTon() {
        return cargoCapInTon;
    }
    public void setCargoCapInTon(int cargoCapInTon) {
        this.cargoCapInTon = cargoCapInTon;
    }

    @Override
    public void funcPrint(){
        System.out.println("Name: " + shipName + ", cargo capacity: " + this.cargoCapInTon);
    }
}
