package project2;

public class HPiWorkstation extends Computer {
    public HPiWorkstation() {
        name = "HPi Workstation";
        memory = "HPi memory";
        CPU = "HPi cpu";
        HDD = "HPi hdd";
        GPU = "a powerful HPi gpu";

        extras.add("an audio card");
        extras.add("a generic network card");
    }
}