public class HourlyEmployee extends Employee {
    private double wage;
    private double numberOfHoursWorked;

    public HourlyEmployee(){
        super();
    }

    public double getWage() { return this.wage; }
    public void setWage(double wage) { this.wage = wage; }

    public double getNumberOfHoursWorked() { return this.numberOfHoursWorked; }
    public void setNumberOfHoursWorked(double hours) { this.numberOfHoursWorked = hours; }


}
