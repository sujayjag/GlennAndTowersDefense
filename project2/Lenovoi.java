package project2;


public class Lenovoi extends Pineapple {
    Computer createComputer(String type) {
        if (type.equals("workstation")) {
            return new LenovoiWorkstation();
        } else if (type.equals("laptop")) {
            return new LenovoiLaptop();
        } else if (type.equals("server")) {
            return new LenovoiServer();
        } else {
            return null;
        }
    }
}