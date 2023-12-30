import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws ParseException {
        View view = new View();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        ArrayList<Animal> animals_list = new ArrayList();
        boolean a = true;

        while(a) {
            view.menu();
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            label36:
            switch (num) {
                case 1:
                    view.sub_menu();
                    int num1 = sc.nextInt();
                    String camel_name;
                    String donkey_name;
                    String horse_name;
                    switch (num1) {
                        case 1:
                            view.pet_menu();
                            int num2 = sc.nextInt();
                            switch (num2) {
                                case 1:
                                    System.out.println("Введите имя собаки: ");
                                    String dog_name = sc.next();
                                    System.out.println("Введите дату рождения собаки: ");
                                    horse_name = sc.next();
                                    Date dog_date = format.parse(horse_name);
                                    System.out.println("Введите скорость собаки: ");
                                    String dog_speed1 = sc.next();
                                    Double dog_speed = Double.parseDouble(dog_speed1);
                                    animals_list.add(new Dog(dog_name, dog_date, dog_speed));
                                    System.out.println("Собака добавлена");
                                    break label36;
                                case 2:
                                    System.out.println("Введите имя кошки: ");
                                    String cat_name = sc.next();
                                    System.out.println("Введите дату рождения кошки: ");
                                    camel_name = sc.next();
                                    Date cat_date = format.parse(camel_name);
                                    System.out.println("Введите скорость кошки: ");
                                    String cat_speed1 = sc.next();
                                    Double cat_speed = Double.parseDouble(cat_speed1);
                                    animals_list.add(new Cat(cat_name, cat_date, cat_speed));
                                    System.out.println("Кошка добавлена");
                                    break label36;
                                case 3:
                                    System.out.println("Введите имя хомяка: ");
                                    String hamster_name = sc.next();
                                    System.out.println("Введите дату рождения хомяка: ");
                                    donkey_name = sc.next();
                                    Date hamster_date = format.parse(donkey_name);
                                    System.out.println("Введите скорость хомяка: ");
                                    String hamster_speed1 = sc.next();
                                    Double hamster_speed = Double.parseDouble(hamster_speed1);
                                    animals_list.add(new Hamster(hamster_name, hamster_date, hamster_speed));
                                    System.out.println("Хомяк добавлен");
                                default:
                                    break label36;
                            }
                        case 2:
                            view.pack_animals_menu();
                            int num3 = sc.nextInt();
                            switch (num3) {
                                case 1:
                                    System.out.println("Введите имя лошади: ");
                                    horse_name = sc.next();
                                    System.out.println("Введите дату рождения лошади: ");
                                    String horse_date1 = sc.next();
                                    Date horse_date = format.parse(horse_date1);
                                    System.out.println("Введите скорость лошади: ");
                                    String horse_speed1 = sc.next();
                                    Double horse_speed = Double.parseDouble(horse_speed1);
                                    animals_list.add(new Horse(horse_name, horse_date, horse_speed));
                                    System.out.println("Лошадь добавлена");
                                    break label36;
                                case 2:
                                    System.out.println("Введите имя верблюда: ");
                                    camel_name = sc.next();
                                    System.out.println("Введите дату рождения верблюда: ");
                                    String camel_date1 = sc.next();
                                    Date camel_date = format.parse(camel_date1);
                                    System.out.println("Введите скорость верблюда: ");
                                    String camel_speed1 = sc.next();
                                    Double camel_speed = Double.parseDouble(camel_speed1);
                                    animals_list.add(new Camel(camel_name, camel_date, camel_speed));
                                    System.out.println("Верблюд добавлен");
                                    break label36;
                                case 3:
                                    System.out.println("Введите имя осла: ");
                                    donkey_name = sc.next();
                                    System.out.println("Введите дату рождения осла: ");
                                    String donkey_date1 = sc.next();
                                    Date donkey_date = format.parse(donkey_date1);
                                    System.out.println("Введите скорость осла: ");
                                    String donkey_speed1 = sc.next();
                                    Double donkey_speed = Double.parseDouble(donkey_speed1);
                                    animals_list.add(new Donkey(donkey_name, donkey_date, donkey_speed));
                                    System.out.println("Осел добавлен");
                            }
                        default:
                            break label36;
                    }
                case 2:
                    Class<Animal> animalClass = Animal.class;
                    Method[] declared_methods = animalClass.getDeclaredMethods();
                    System.out.println("Список команд: ");
                    Method[] var10 = declared_methods;
                    int var11 = declared_methods.length;

                    for(int var12 = 0; var12 < var11; ++var12) {
                        Method method = var10[var12];
                        System.out.println(method);
                    }

                    System.out.println("---------");
                    break;
                case 3:
                    a = false;
            }

            System.out.println("Список животных: \n" + String.valueOf(animals_list));
            System.out.println("----------");
        }

    }
}