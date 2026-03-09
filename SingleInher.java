//Single Inheritance
class Device
{
    void poweron()
    {
        System.out.println("Device is powered on");
    }
}
class Laptop extends Device{
    void coding()
    {
        System.out.println("Laptop used for coding");
    }
}
public class SingleInher {
    public static void main(String[] args) {
        Laptop l=new Laptop();
l.poweron();
l.coding();
    }
}