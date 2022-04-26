package project2;

public class DellisServer extends Computer {
    public DellisServer() {
        setName("Dellis Server");
        setMemory("multiple Dellis memory chips");
        setCPU("a powerful Dellis cpu with many cores");
        setHDD("multiple Dellis hdds");
        setGPU("a generic Dellis gpu");

        getExtras().add("a powerful Dellis network card");
    }
}