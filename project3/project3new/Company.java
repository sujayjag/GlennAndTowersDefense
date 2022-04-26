package project3new;

public class Company {
    private EmployeeComponent employees;

    public Company(EmployeeComponent employees) {
        this.setEmployees(employees);
    }

    public EmployeeComponent getEmployees() {
        return employees;
    }

    public void setEmployees(EmployeeComponent employees) {
        this.employees = employees;
    }
}
