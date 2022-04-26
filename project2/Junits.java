package project2;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Junits {
    Pineapple HPi = new HPi();
    Pineapple Dellis = new Dellis();
    Pineapple Lenovoi = new Lenovoi();

    @Test
    public void testCreateHPiWorkstation() {
        Computer computer = HPi.createComputer("workstation");

        assertTrue(computer.getName().equals("HPi Workstation")
            && computer.getMemory().equals("HPi memory")
            && computer.getCPU().equals("HPi cpu")
            && computer.getHDD().equals("HPi hdd")
            && computer.getGPU().equals("a powerful HPi gpu")
            && computer.getExtras().get(0).equals("an audio card")
            && computer.getExtras().get(1).equals("a generic network card"));
    }

    @Test
    public void testCreateHPiLaptop() {
        Computer computer = HPi.createComputer("laptop");

        assertTrue(computer.getName().equals("HPi Laptop")
            && computer.getMemory().equals("a light HPi memory")
            && computer.getCPU().equals("a light HPi cpu")
            && computer.getHDD().equals("a light HPi hdd")
            && computer.getGPU().equals("a light HPi gpu")
            && computer.getExtras().get(0).equals("a light WiFi card"));
    }

    @Test
    public void testCreateHPiServer() {
        Computer computer = HPi.createComputer("server");

        assertTrue(computer.getName().equals("HPi Server")
            && computer.getMemory().equals("multiple HPi memory chips")
            && computer.getCPU().equals("a powerful HPi cpu with many cores")
            && computer.getHDD().equals("multiple HPi hdds")
            && computer.getGPU().equals("a generic HPi gpu")
            && computer.getExtras().get(0).equals("a powerful HPi network card"));
    }

    @Test
    public void testCreateDellisWorkstation() {
        Computer computer = Dellis.createComputer("workstation");

        assertTrue(computer.getName().equals("Dellis Workstation")
            && computer.getMemory().equals("Dellis memory")
            && computer.getCPU().equals("Dellis cpu")
            && computer.getHDD().equals("Dellis hdd")
            && computer.getGPU().equals("a powerful Dellis gpu")
            && computer.getExtras().get(0).equals("an audio card")
            && computer.getExtras().get(1).equals("a generic network card"));
    }

    @Test
    public void testCreateDellisLaptop() {
        Computer computer = Dellis.createComputer("laptop");

        assertTrue(computer.getName().equals("Dellis Laptop")
            && computer.getMemory().equals("a light Dellis memory")
            && computer.getCPU().equals("a light Dellis cpu")
            && computer.getHDD().equals("a light Dellis hdd")
            && computer.getGPU().equals("a light Dellis gpu")
            && computer.getExtras().get(0).equals("a light WiFi card"));
    }

    @Test
    public void testCreateDellisServer() {
        Computer computer = Dellis.createComputer("server");

        assertTrue(computer.getName().equals("Dellis Server")
            && computer.getMemory().equals("multiple Dellis memory chips")
            && computer.getCPU().equals("a powerful Dellis cpu with many cores")
            && computer.getHDD().equals("multiple Dellis hdds")
            && computer.getGPU().equals("a generic Dellis gpu")
            && computer.getExtras().get(0).equals("a powerful Dellis network card"));
    }

    @Test
    public void testCreateLenovoiWorkstation() {
        Computer computer = Lenovoi.createComputer("workstation");

        assertTrue(computer.getName().equals("Lenovoi Workstation")
            && computer.getMemory().equals("Lenovoi memory")
            && computer.getCPU().equals("Lenovoi cpu")
            && computer.getHDD().equals("Lenovoi hdd")
            && computer.getGPU().equals("a powerful Lenovoi gpu")
            && computer.getExtras().get(0).equals("an audio card")
            && computer.getExtras().get(1).equals("a generic network card"));
    }

    @Test
    public void testCreateLenovoiLaptop() {
        Computer computer = Lenovoi.createComputer("laptop");

        assertTrue(computer.getName().equals("Lenovoi Laptop")
            && computer.getMemory().equals("a light Lenovoi memory")
            && computer.getCPU().equals("a light Lenovoi cpu")
            && computer.getHDD().equals("a light Lenovoi hdd")
            && computer.getGPU().equals("a light Lenovoi gpu")
            && computer.getExtras().get(0).equals("a light WiFi card"));
    }

    @Test
    public void testCreateLenovoiServer() {
        Computer computer = Lenovoi.createComputer("server");

        assertTrue(computer.getName().equals("Lenovoi Server")
            && computer.getMemory().equals("multiple Lenovoi memory chips")
            && computer.getCPU().equals("a powerful Lenovoi cpu with many cores")
            && computer.getHDD().equals("multiple Lenovoi hdds")
            && computer.getGPU().equals("a generic Lenovoi gpu")
            && computer.getExtras().get(0).equals("a powerful Lenovoi network card"));
    }
}