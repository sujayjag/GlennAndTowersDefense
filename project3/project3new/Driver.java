package project3new;

public class Driver {
    public static void main(String[] args) {
        Employee ceo = new Employee("James Borg", "CEO", "HQ", 220000, "Male", false);

        Employee cfo = new Employee("Jennifer Wallace", "CFO", "Administration", 172000, "Female", true);

        Employee crado = new Employee("Franklin Wong", "CRADO", "R&D", 160000, "Male", true);

        Employee officeManager = new Employee("Alicia Zelaya", "Office Manager", "Administration", 75000, "Female", false);

        Employee admin = new Employee("Ahmad Jabbar", "Admin", "Administration", 100000, "Male", false);

        Employee researchAssistant = new Employee("John Smith", "Research Assistant", "R&D", 120000, "Male", true);

        Employee dataScientist = new Employee("Ramesh Narayan", "Data Scientist", "R&D", 152000, "Male", false);

        ceo.add(cfo);
        ceo.add(crado);
        cfo.add(officeManager);
        cfo.add(admin);
        crado.add(researchAssistant);
        crado.add(dataScientist);

        Company company = new Company(ceo);

        //Report 1
        System.out.println("REPORT 1");
        System.out.print(company.getEmployees().getGraph());

        //Report 2
        System.out.println("REPORT 2");
        System.out.print(company.getEmployees().getReport2());

        //Report 3
        System.out.println("REPORT 3");
        System.out.print(company.getEmployees().getReport3());

        //Report 4
        System.out.println("REPORT 4");
        System.out.println(company.getEmployees().getReport4());

        dataScientist.add(new Employee("Joyce English", "ML Engineer", "R&D", 140000, "Female", false));

        //new Report 1
        System.out.println("NEW REPORT 1");
        System.out.print(company.getEmployees().getGraph());

        //new Report 2
        System.out.println("NEW REPORT 2");
        System.out.print(company.getEmployees().getReport2());

        //new Report 3
        System.out.println("NEW REPORT 3");
        System.out.print(company.getEmployees().getReport3());

        //new Report 4
        System.out.println("NEW REPORT 4");
        System.out.println(company.getEmployees().getReport4());
    }

}
