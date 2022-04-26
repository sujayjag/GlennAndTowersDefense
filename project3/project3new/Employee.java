package project3new;

import java.util.ArrayList;
import java.util.List;

public class Employee extends EmployeeComponent {


    public Employee(String name, String position, String department, int salary, String gender, boolean hasDependents) {
        super(name, position, department, salary, gender, hasDependents);
    }

    public void add(EmployeeComponent e) {
        getSubordinates().add(e);
    }

    public EmployeeComponent remove(EmployeeComponent e) {
        getSubordinates().remove(e);
        return e;
    }

    public EmployeeComponent getChild(int i) {
        return getSubordinates().get(i);
    }

    public String toString() {
        String s = String.format("Name: %s, Position: %s, Department: %s, Salary: %d, Gender: %s, Has Dependents: %b\n", getName(), getPosition(), getDepartment(), getSalary(), getGender(), isHasDependents());
        return s;
    }


    public String getGraph() {
        List<String> graph = callGraph(this);

        String listString = String.join("\n ", graph);
        return listString;
    }

    private List<String> callGraph(EmployeeComponent cur) {
        List<String> l = new ArrayList<>();
        rGetGraph(cur, l);
        return l;
    }

    private void rGetGraph(EmployeeComponent cur, List<String> l) {

        l.add(cur.toString());

        if(cur.getSubordinates().size() == 0) {
            return;
        }
        for(EmployeeComponent e : cur.getSubordinates()) {
            rGetGraph(e, l);
        }

    }

    public String getReport2() {
        List<String> graph = callReport2(this);

        String listString = String.join("\n ", graph);
        return listString;
    }

    private List<String> callReport2(EmployeeComponent cur) {
        List<String> l = new ArrayList<>();
        report2(cur, l);
        return l;
    }

    private void report2(EmployeeComponent cur, List<String> l) {
        if(cur.isHasDependents() && cur.getGender().equals("Male")) {
            l.add(cur.toString());
        }

        if(cur.getSubordinates().size() == 0) {
            return;
        }
        for(EmployeeComponent e : cur.getSubordinates()) {
            report2(e, l);
        }

    }

    public String getReport3() {
        List<String> graph = callReport3(this);

        String listString = String.join("\n ", graph);
        return listString;
    }

    private List<String> callReport3(EmployeeComponent cur) {
        List<String> l = new ArrayList<>();
        report3(cur, l);
        return l;
    }

    private void report3(EmployeeComponent cur, List<String> l) {
        if(cur.getGender().equals("Female")) {
            l.add(cur.toString());
        }

        if(cur.getSubordinates().size() == 0) {
            return;
        }
        for(EmployeeComponent e : cur.getSubordinates()) {
            report3(e, l);
        }

    }

    public double getReport4() {
        List<Integer> graph = callReport4(this);

        int count = 0;

        for(int num : graph) {
            count += num;
        }

        return (double) count/graph.size();
    }

    private List<Integer> callReport4(EmployeeComponent cur) {
        List<Integer> l = new ArrayList<>();
        report4(cur, l);
        return l;
    }

    private void report4(EmployeeComponent cur, List<Integer> l) {

        l.add(cur.getSalary());


        if(cur.getSubordinates().size() == 0) {
            return;
        }
        for(EmployeeComponent e : cur.getSubordinates()) {
            report4(e, l);
        }

    }

}