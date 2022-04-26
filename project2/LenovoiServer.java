package project2;

public class LenovoiServer extends Computer {
    public LenovoiServer() {
        setName("Lenovoi Server");
        setMemory("multiple Lenovoi memory chips");
        setCPU("a powerful Lenovoi cpu with many cores");
        setHDD("multiple Lenovoi hdds");
        setGPU("a generic Lenovoi gpu");

        getExtras().add("a powerful Lenovoi network card");
    }
}