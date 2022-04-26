package project3new;

public class Company {
    EmployeeComponent employees;

    public Company(EmployeeComponent employees) {
        this.employees = employees;
    }

    public void printReport1() {
        System.out.println(this.employees.getGraph());
    }
}
