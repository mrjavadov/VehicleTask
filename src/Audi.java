public class Audi extends Vehicle implements Carmethods {
    @Override
    public void drive() {
        System.out.println("Audi drive");

    }

    @Override
    public void gasoline() {
        System.out.println("Audi gasoline");

    }

    @Override
    public void pickUpSpeed() {
        System.out.println("Audi pick up speed");

    }

    public Audi(String color, int speed) {
        super(color, speed);

    }

    @Override
    void display() {
        super.display();
    }

    @Override
    void speed() {
        super.speed();
    }
}


