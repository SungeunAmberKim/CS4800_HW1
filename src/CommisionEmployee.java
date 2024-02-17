public class CommisionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    public CommisionEmployee(){
        super();
    }

    public double getCommissionRate() { return this.commissionRate; }
    public void setCommissionRate(double rate) { this.commissionRate = rate; }
    public double getGrossSales() { return this.grossSales; }
    public void setGrossSales(double sales) { this.grossSales = sales; }
}
