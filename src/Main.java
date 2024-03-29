
public class Main {
    public static void main(String[] args) {
        partOneDemo();
        partTwoDemo();
        partThreeDemo();
        partFourDemo();



    }

    public static void partOneDemo(){
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
    public static void partTwoDemo(){
        Ship [] ships = new Ship[3];
        ships[0] = new Ship();
        ships[0].setShipName("Uni");
        ships[0].setShipYearBuilt("2022");

        ships[1] = new CruiseShip();
        ships[1].setShipName("Moe");
        ((CruiseShip)ships[1]).setMaxPassenger(666);

        ships[2] = new CargoShip();
        ships[2].setShipName("Tori");
        ((CargoShip)ships[2]).setCargoCapInTon(9999);

        // Loop to call each object's print function
        for (Ship ship : ships) {
            ship.funcPrint();
        }
    }
    public static void partThreeDemo(){
        Instructor[] instructors = {new Instructor(), new Instructor()};
        instructors[0].setFirstName("Nima");
        instructors[0].setLastName("Davarpanah");
        instructors[0].setOfficeNumber("3-2636");

        instructors[1].setFirstName("Uni");
        instructors[1].setLastName("Kim");
        instructors[1].setOfficeNumber("5-0028");

        Textbook[] textbooks = {new Textbook(), new Textbook()};
        textbooks[0].setTitle("Clean Code");
        textbooks[0].setAuthor("Robert C. Martin");
        textbooks[0].setPublisher("Pearson");

        textbooks[1].setTitle("Clean Litterbox");
        textbooks[1].setAuthor("Moe Park");
        textbooks[1].setPublisher("ChaChaCha");

        Course course = new Course();
        course.setCourseName("Software Engineering");
        course.setInstructors(instructors);
        course.setTextbooks(textbooks);

        course.print();
    }
    public static void partFourDemo(){
        Folder demo1 = new Folder();
        demo1.setName("demo1");

        Folder sourceFiles = new Folder();
        sourceFiles.setName("Source Files");

        Folder app = new Folder();
        app.setName("app");
        Folder phalcon = new Folder();
        phalcon.setName(".phalcon");

        String[] appSubFolders = {"config", "controllers", "library", "migrations", "models", "views"};
        for (String name : appSubFolders) {
            Folder subFolder = new Folder();
            subFolder.setName(name);
            app.addSubFolder(subFolder);
        }

        Folder cache = new Folder();
        cache.setName("cache");

        Folder publicFolder = new Folder();
        publicFolder.setName("public");

        String[] publicFiles = {".htaccess", ".htrouter.php", "index.html"};
        for (String fileName : publicFiles) {
            File file = new File();
            file.setName(fileName);
            publicFolder.addFile(file);
        }

        Folder includePath = new Folder();
        includePath.setName("Include Path");

        Folder remoteFiles = new Folder();
        remoteFiles.setName("Remote Files");


        sourceFiles.addSubFolder(phalcon);
        sourceFiles.addSubFolder(app);
        sourceFiles.addSubFolder(cache);
        sourceFiles.addSubFolder(publicFolder);

        demo1.addSubFolder(sourceFiles);
        demo1.addSubFolder(includePath);
        demo1.addSubFolder(remoteFiles);

        // 1
        System.out.println("Initial File System Structure:");
        demo1.print("");
        System.out.println();

        // 2
        sourceFiles.deleteSubFolder("app");
        System.out.println("After Deleting 'app' Folder:");
        demo1.print("");
        System.out.println();

        // 3
        sourceFiles.deleteSubFolder("public");
        System.out.println("After Deleting 'public' Folder:");
        demo1.print("");
    }
}