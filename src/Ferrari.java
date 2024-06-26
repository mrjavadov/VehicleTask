public class Ferrari extends Vehicle implements Carmethods {



    @Override
    public void pickUpSpeed() {
        System.out.println("Ferrari picked up speed");

    }

    @Override
    public void gasoline() {
        System.out.println("Ferrari gasoline");

    }

    @Override
    public void drive() {
        System.out.println("Ferrari drive");

    }

    public Ferrari(String color, int speed) {
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

