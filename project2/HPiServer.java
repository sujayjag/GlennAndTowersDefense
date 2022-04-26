package project2;


public class HPiServer extends Computer {
    public HPiServer() {
        setName("HPi Server");
        setMemory("multiple HPi memory chips");
        setCPU("a powerful HPi cpu with many cores");
        setHDD("multiple HPi hdds");
        setGPU("a generic HPi gpu");

        getExtras().add("a powerful HPi network card");
    }
}