package HW2.Methods;

import HW2.classes.Animal;
import HW2.classes.Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Methods {

    public static void listOfActions() {
        System.out.println("Пожалуйста, выберите действие и введите цифру:\n" +
                "1. Добавить животное\n" +
                "2. Удалить животное\n" +
                "3. Вывести информацию о животном\n" +
                "4. Попросить всех животных издать звуки\n" +
                "5. Попросить конкретного животного издать звук");
    }

    public static void methods(ArrayList<Animal> animals) {
        Methods.listOfActions();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice > 0 & choice < 7){
            if (choice == 1){
                Zoo.addElementsInArray(animals);
            }
            if (choice == 2) {
                Zoo.deleteElementsInArray(animals);
            }
            if (choice == 3){
                Zoo.getArray(animals);
            }
            if (choice == 4){
                Zoo.makeSoundAll(animals);
            }
            if (choice == 5){
                Zoo.makeSound(animals);
            }
        }
        else System.out.println("Неверный ввод");
    }

}
