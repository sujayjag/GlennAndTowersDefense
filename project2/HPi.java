package project2;
public class HPi extends Pineapple {
    Computer createComputer(String type) {
        if (type.equals("workstation")) {
            return new HPiWorkstation();
        } else if (type.equals("laptop")) {
            return new HPiLaptop();
        } else if (type.equals("server")) {
            return new HPiWorkstation();
        } else {
            return null;
        }
    }
}