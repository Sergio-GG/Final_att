import java.util.Date;

abstract class Animal {
    String name;
    Date date_of_birth;
    Double speed;

    Animal() {
    }

    public void eat() {
        System.out.println("yami-yami");
    }
}