import java.util.Date;

abstract public class Pack_animal extends Animal {
    String name;
    Date date_of_birth;
    Double speed;

    public Pack_animal() {
    }

    public void eat() {
        System.out.println("I eat everywhere!");
    }
}
