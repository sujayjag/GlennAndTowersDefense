package project3new;

public class Company {
    private EmployeeComponent employees;

    public Company(EmployeeComponent employees) {
        this.setEmployees(employees);
    }

    public void printReport1() {
        System.out.println(this.getEmployees().getGraph());
    }

    public EmployeeComponent getEmployees() {
        return employees;
    }

    public void setEmployees(EmployeeComponent employees) {
        this.employees = employees;
    }
}
