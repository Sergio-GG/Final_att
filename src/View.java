import java.util.Scanner;

public class View {
    Scanner scan;

    public View() {
        this.scan = new Scanner(System.in);
    }

    public void menu() {
        System.out.println("Выберите действие: \n1 - Завести новое животное\n2 - Показать список команд\n3 - Выйти\n");
    }

    public void sub_menu() {
        System.out.println("Выберите действие: \n1 - Завести домашнее животное\n2 - Завести вьючное животное\n");
    }

    public void pet_menu() {
        System.out.println("Выберите действие: \n1 - Завести собаку\n2 - Завести кота\n3 - Завести хомяка\n");
    }

    public void pack_animals_menu() {
        System.out.println("Выберите действие: \n1 - Завести лошадь\n2 - Завести верблюда\n3 - Завести осла\n");
    }
}
