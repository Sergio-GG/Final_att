import java.util.Date;

public abstract class Pet extends Animal {
    String name;
    Date date_of_birth;
    Double speed;

    public Pet() {
    }

    public void eat() {
        System.out.println("I eat at home!");
    }
}