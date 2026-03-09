

//Multiple Inheritance
//Camera + Music → SmartPhone
interface Camera {
    void takePhoto();
}

interface Music {
    void playMusic();
}

class SmartPhone implements Camera, Music {

    public void takePhoto() {
        System.out.println("Phone takes photo");
    }

    public void playMusic() {
        System.out.println("Phone plays music");
    }
}

public class Multiple {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.takePhoto();
        s.playMusic();
    }
}
