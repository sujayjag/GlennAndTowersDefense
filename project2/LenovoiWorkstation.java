package project2;

public class LenovoiWorkstation extends Computer {
    public LenovoiWorkstation() {
        setName("Lenovoi Workstation");
        setMemory("Lenovoi memory");
        setCPU("Lenovoi cpu");
        setHDD("Lenovoi hdd");
        setGPU("a powerful Lenovoi gpu");

        getExtras().add("an audio card");
        getExtras().add("a generic network card");
    }
}