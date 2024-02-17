public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(){
        super();
    }

    public double getWeeklySalary() { return this.weeklySalary; }
    public void setWeeklySalary(double weeklySalary) { this.weeklySalary = weeklySalary; }
}
