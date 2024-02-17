public class BaseEmployee extends Employee{
    private double baseSalary;

    public BaseEmployee(){
        super();
    }

    public double getBaseSalary() { return this.baseSalary; }
    public void setBaseSalary(double salary) { this.baseSalary = salary; }
}
