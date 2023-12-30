import java.util.Date;

public class Hamster extends Pet {
    String name;
    Date date_of_birth;
    Double speed;

    public void eat() {
        super.eat();
    }

    public Hamster(String name, Date date_of_birth, Double speed) {
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.speed = speed;
    }

    public String toString() {
        String var10000 = this.name;
        return "Hamster{name='" + var10000 + "', date_of_birth=" + String.valueOf(this.date_of_birth) + ", speed=" + this.speed + "}";
    }
}