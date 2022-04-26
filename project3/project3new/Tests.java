package project3new;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Tests {

    private Employee tier1 = new Employee("Sripushkar", "CEO", "Administration", 36000, "Male", false);

    private Employee surajTier2 = new Employee("Suraj", "CFO", "HR", 30000, "Male", true);

    private Employee pujithTier2 = new Employee("Pujith", "CRADO", "HR", 25000, "Male", false);

    private Employee sujayTier3 = new Employee("Sujay", "Engineer", "Automation", 20000, "Male", true);

    private Employee sanjayTier4 = new Employee("Sanjay", "Office Manager", "Administration", 10000, "male", false);


    //test remove
    @Test
    public void Test1() {
        tier1.add(surajTier2);
        tier1.add(pujithTier2);
        assertTrue(tier1.remove(surajTier2).equals(surajTier2) && tier1.getSubordinates().size()==1);
    }

    //test adding
    @Test
    public void Test2() {
        tier1.add(surajTier2);
        tier1.add(pujithTier2);
        List<EmployeeComponent> list = new ArrayList<>();
        list.add(surajTier2);
        list.add(pujithTier2);
        assertTrue(tier1.getSubordinates().equals(list));
    }

    //test to get leaf node
    @Test
    public void Test3() {
        tier1.add(surajTier2);
        surajTier2.add(sujayTier3);
        EmployeeComponent employee = tier1;
        while(true) {
            try {
              employee = employee.getChild(0);
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        assertTrue(employee == sujayTier3);
    }

    //test company and subcompanies
    @Test
    public void Test4() {
        tier1.add(surajTier2);
        surajTier2.add(sujayTier3);
        sujayTier3.add(sanjayTier4);
        Company company1 = new Company(tier1);
        Company company2 = new Company(surajTier2);

        assertTrue(company1.getEmployees().getChild(0).getGraph().equals(company2.getEmployees().getGraph()));
    }

    //check average salary  
    @Test
    public void Test5() {
        tier1.add(surajTier2);
        tier1.add(pujithTier2);
        surajTier2.add(sujayTier3);
        sujayTier3.add(sanjayTier4);

        assertTrue(tier1.getReport4() == (double) (tier1.getSalary() + surajTier2.getSalary() + pujithTier2.getSalary() + sujayTier3.getSalary() +
            sanjayTier4.getSalary())/5);
    }
}
