package project2;

public class DellisWorkstation extends Computer {
    public DellisWorkstation() {
        setName("Dellis Workstation");
        setMemory("Dellis memory");
        setCPU("Dellis cpu");
        setHDD("Dellis hdd");
        setGPU("a powerful Dellis gpu");

        getExtras().add("an audio card");
        getExtras().add("a generic network card");
    }
}