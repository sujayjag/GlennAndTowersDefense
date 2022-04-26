package project3new;

import java.util.ArrayList;
import java.util.List;

public abstract class EmployeeComponent {
    private String name;
    private String position;
    private String department;
    private int salary;
    private String gender;
    private boolean hasDependents;
    private List<EmployeeComponent> subordinates = new ArrayList<>();
//
    public EmployeeComponent(String name, String position, String department, int salary, String gender, boolean hasDependents) {
        this.setName(name);
        this.setPosition(position);
        this.setDepartment(department);
        this.setSalary(salary);
        this.setGender(gender);
        //this.subordinates = subordinates;
        this.setHasDependents(hasDependents);
    }

    public void add(EmployeeComponent e) {
        throw new UnsupportedOperationException();
    }

    public EmployeeComponent remove(EmployeeComponent e) {
        throw new UnsupportedOperationException();
    }

    public EmployeeComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        throw new UnsupportedOperationException();
    }


    public String getGraph() {
        throw new UnsupportedOperationException();
    }

    private List<String> callGraph(EmployeeComponent cur) {
        throw new UnsupportedOperationException();
    }

    private void rGetGraph(EmployeeComponent cur, List<String> l) {

        throw new UnsupportedOperationException();

    }

    public String getReport2() {
        throw new UnsupportedOperationException();
    }


    public String getReport3() {
        throw new UnsupportedOperationException();
    }



    public double getReport4() {
        throw new UnsupportedOperationException();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isHasDependents() {
        return hasDependents;
    }

    public void setHasDependents(boolean hasDependents) {
        this.hasDependents = hasDependents;
    }

    public List<EmployeeComponent> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<EmployeeComponent> subordinates) {
        this.subordinates = subordinates;
    }
}
