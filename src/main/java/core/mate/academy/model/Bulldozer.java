package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    String length;
    String width;

    public Bulldozer() {
        super(null, null);
    }

    public Bulldozer(String name, String color, String length, String width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    public void workBull(){

    }
    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
