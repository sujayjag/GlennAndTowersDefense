public class Dellis extends Pineapple {
    Computer createComputer(String type) {
        if (type.equals("workstation")) {
            return new DellisWorkstation();
        } else if (type.equals("laptop")) {
            return new DellisLaptop();
        } else if (type.equals("server")) {
            return new DellisServer();
        } else {
            return null;
        }
    }
}