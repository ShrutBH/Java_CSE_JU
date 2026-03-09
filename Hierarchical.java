
//Payment → UPI, CreditCard
class Payment {
    void process() {
        System.out.println("Processing payment");
    }
}

class UPI extends Payment {
    void upiPay() {
        System.out.println("Payment done using UPI");
    }
}

class CreditCard extends Payment {
    void cardPay() {
        System.out.println("Payment done using Credit Card");
    }
}

public class Hierarchical {
     public static void main(String[] args) {
        UPI u = new UPI();
        u.process();
        u.upiPay();

        CreditCard c = new CreditCard();
        c.process();
        c.cardPay();
}
}
