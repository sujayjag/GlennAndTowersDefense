package project2;

public class ComputerTestDrive {
    public static void main(String[] args) {
        Pineapple HPi = new HPi();
        Pineapple Dellis = new Dellis();
        Pineapple Lenovoi = new Lenovoi();

        System.out.println("Michael ordered a Dellis workstation");
        Dellis.orderComputer("workstation");
   
        System.out.println("Hanna ordered a HPi server");
        HPi.orderComputer("server");

        System.out.println("Lenny ordered a Lenovoi laptop");
        Lenovoi.orderComputer("laptop");
        
    }
}
