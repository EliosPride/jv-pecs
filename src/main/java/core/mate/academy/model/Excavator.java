package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    String productCapacity;
    String height;

    public Excavator() {
    super (null, null);
    }

    public Excavator(String name, String color, String productCapacity, String height) {
        super(name, color);
        this.productCapacity = productCapacity;
        this.height = height;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
