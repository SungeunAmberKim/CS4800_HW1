
public class Main {
    public static void main(String[] args) {
        // part 1

        SalariedEmployee joe = new SalariedEmployee();
        SalariedEmployee renwa = new SalariedEmployee();
        HourlyEmployee stephanie = new HourlyEmployee();
        HourlyEmployee mary = new HourlyEmployee();
        CommisionEmployee nicole = new CommisionEmployee();
        CommisionEmployee mahnaz = new CommisionEmployee();
        BaseEmployee mike = new BaseEmployee();

        joe.setFirstName("Joe");
        joe.setLastName("Jones");
        joe.setSSN("111-11-1111");
        joe.setWeeklySalary(2500);

        stephanie.setFirstName("Stephanie");
        stephanie.setLastName("Smith");
        stephanie.setSSN("222-22-2222");
        stephanie.setWage(25);
        stephanie.setNumberOfHoursWorked(32);

        mary.setFirstName("Mary");
        mary.setLastName("Quinn");
        mary.setSSN("333-33-3333");
        mary.setWage(19);
        mary.setNumberOfHoursWorked(47);

        nicole.setFirstName("Nicole");
        nicole.setLastName("Dior");
        nicole.setSSN("444-44-4444");
        nicole.setCommissionRate(15);
        nicole.setGrossSales(50000);

        renwa.setFirstName("Renwa");
        renwa.setLastName("Chanel");
        renwa.setSSN("555-55-5555");
        renwa.setWeeklySalary(1700);

        mike.setFirstName("Mike");
        mike.setLastName("Davenport");
        mike.setSSN("666-66-6666");
        mike.setBaseSalary(95000);

        mahnaz.setFirstName("Mahnaz");
        mahnaz.setLastName("Vaziri");
        mahnaz.setSSN("777-77-7777");
        mahnaz.setCommissionRate(22);
        mahnaz.setGrossSales(40000);

    }
}