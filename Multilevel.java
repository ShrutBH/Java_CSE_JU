//Multilevel Inheritance
class Device {
    void powerOn() {
        System.out.println("Device is powered on");
    }
}

class Laptop extends Device {
    void coding() {
        System.out.println("Laptop is used for coding");
    }
}

class GamingLaptop extends Laptop {
    void playGames() {
        System.out.println("Gaming laptop runs heavy games");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        GamingLaptop g = new GamingLaptop();
        g.powerOn();
        g.coding();
        g.playGames();
    }
}