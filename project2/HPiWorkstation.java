package project2;

public class HPiWorkstation extends Computer {
    public HPiWorkstation() {
        setName("HPi Workstation");
        setMemory("HPi memory");
        setCPU("HPi cpu");
        setHDD("HPi hdd");
        setGPU("a powerful HPi gpu");

        getExtras().add("an audio card");
        getExtras().add("a generic network card");
    }
}