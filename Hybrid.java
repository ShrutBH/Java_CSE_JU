//Hybrid Inheritance
//Device System
class Device {
    void start() {
        System.out.println("Device started");
    }
}

interface Internet {
    void connect();
}

class Phone extends Device implements Internet {

    public void connect() {
        System.out.println("Phone connected to internet");
    }
}

class Tablet extends Device implements Internet {

    public void connect() {
        System.out.println("Tablet connected to internet");
    }
}
public class Hybrid {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.start();
        p.connect();

        Tablet t = new Tablet();
        t.start();
        t.connect();
    }
}