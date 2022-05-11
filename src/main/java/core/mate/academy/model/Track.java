package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    String hp;
    String seatCount;

    public Track() {
        super(null, null);
    }

    public Track(String name, String color, String hp, String seatCount) {
        super(name, color);
        this.hp = hp;
        this.seatCount = seatCount;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
