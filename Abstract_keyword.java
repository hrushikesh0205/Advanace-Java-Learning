abstract class car {
    public abstract void drive();
    public abstract void fly();

    public void playmusic() {
        System.out.println("Play Music");
    }
}

class Wagnor extends car {
    public void drive() {
        System.out.println("Driving");
    }

    public void fly() {
        System.out.println("Flying");
    }
}

class demo extends Wagnor {
    public void show() {
        System.out.println("Abstract keywords");
    }
}

public class Abstract_keyword {
    public static void main(String[] args) {
        demo obj = new demo();
        obj.playmusic();
        obj.fly();
        obj.drive();
        obj.show();
    }
}