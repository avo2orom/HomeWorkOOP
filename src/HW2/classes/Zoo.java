package HW2.classes;

import HW2.classes.birds.Chicken;
import HW2.classes.birds.Stork;
import HW2.classes.pets.Cat;
import HW2.classes.pets.Dog;
import HW2.classes.wild.Tiger;
import HW2.classes.wild.Wolf;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {

    public static void listOfAnimals() {
        System.out.println("Животные в зоопарке:\n" +
                "1. Кот\n" +
                "2. Тигр\n" +
                "3. Собака\n" +
                "4. Волк\n" +
                "5. Курица\n" +
                "6. Аист\n");
    }

    public static void addElementsInArray(ArrayList<Animal> animals) {

        System.out.println("Выберите из списка животное, которые хотите добавить и введите его номер");
        Zoo.listOfAnimals();
        Scanner sc = new Scanner(System.in);
        int addNumber = sc.nextInt();

        if (addNumber > 0 & addNumber < 7) {
            if (addNumber == 1) {
                System.out.print("\nРост: ");
                Scanner heightScanner = new Scanner(System.in);
                Double height = heightScanner.nextDouble();
                System.out.print("Вес: ");
                Scanner weightScanner = new Scanner(System.in);
                Double weight = weightScanner.nextDouble();
                System.out.print("Цвет глаз: ");
                Scanner eyeScanner = new Scanner(System.in);
                String eyes = eyeScanner.next();
                System.out.print("Кличка: ");
                Scanner nameScanner = new Scanner(System.in);
                String name = nameScanner.next();
                System.out.print("Порода: ");
                Scanner breedScanner = new Scanner(System.in);
                String breed = breedScanner.next();
                System.out.print("Вакцинации: ");
                Scanner vacScanner = new Scanner(System.in);
                String vaccination = vacScanner.next();
                System.out.print("Окрас шерсти: ");
                Scanner colorScanner = new Scanner(System.in);
                String color = colorScanner.next();
                System.out.print("Дата рождения: ");
                Scanner birthScanner = new Scanner(System.in);
                String birthDate = birthScanner.next();
                System.out.print("Наличие шерсти: ");
                Scanner woolScanner = new Scanner(System.in);
                String wool = woolScanner.next();
                Animal newCat = new Cat(height, weight, eyes, name, breed, vaccination, color, birthDate, wool);
                System.out.printf("\nВы добавили кота со следующими характеристиками: %s", newCat);
                animals.add(newCat);
            }
            if (addNumber == 2) {
                System.out.print("\nРост: ");
                Scanner heightScanner = new Scanner(System.in);
                Double height = heightScanner.nextDouble();
                System.out.print("Вес: ");
                Scanner weightScanner = new Scanner(System.in);
                Double weight = weightScanner.nextDouble();
                System.out.print("Цвет глаз: ");
                Scanner eyeScanner = new Scanner(System.in);
                String eyes = eyeScanner.next();
                System.out.print("Место обитания: ");
                Scanner habitatScanner = new Scanner(System.in);
                String habitat = habitatScanner.next();
                System.out.print("Дата нахождения: ");
                Scanner dateFoundScanner = new Scanner(System.in);
                String dateFound = dateFoundScanner.next();
                Animal newTiger = new Tiger(height, weight, eyes, habitat, dateFound);
                System.out.printf("\nВы добавили тигра со следующими характеристиками: %s", newTiger);
                animals.add(newTiger);
            }
            if (addNumber == 3) {
                System.out.print("\nРост: ");
                Scanner heightScanner = new Scanner(System.in);
                Double height = heightScanner.nextDouble();
                System.out.print("Вес: ");
                Scanner weightScanner = new Scanner(System.in);
                Double weight = weightScanner.nextDouble();
                System.out.print("Цвет глаз: ");
                Scanner eyeScanner = new Scanner(System.in);
                String eyes = eyeScanner.next();
                System.out.print("Кличка: ");
                Scanner nameScanner = new Scanner(System.in);
                String name = nameScanner.next();
                System.out.print("Порода: ");
                Scanner breedScanner = new Scanner(System.in);
                String breed = breedScanner.next();
                System.out.print("Вакцинации: ");
                Scanner vacScanner = new Scanner(System.in);
                String vaccination = vacScanner.next();
                System.out.print("Окрас шерсти: ");
                Scanner colorScanner = new Scanner(System.in);
                String color = colorScanner.next();
                System.out.print("Дата рождения: ");
                Scanner birthScanner = new Scanner(System.in);
                String birthDate = birthScanner.next();
                System.out.print("Дрессировка: ");
                Scanner trainScanner = new Scanner(System.in);
                String train = trainScanner.next();
                Animal newDog = new Dog(height, weight, eyes, name, breed, vaccination, color, birthDate, train);
                System.out.printf("\nВы добавили собаку со следующими характеристиками: %s", newDog);
                animals.add(newDog);
            }
            if (addNumber == 4) {
                System.out.print("\nРост: ");
                Scanner heightScanner = new Scanner(System.in);
                Double height = heightScanner.nextDouble();
                System.out.print("Вес: ");
                Scanner weightScanner = new Scanner(System.in);
                Double weight = weightScanner.nextDouble();
                System.out.print("Цвет глаз: ");
                Scanner eyeScanner = new Scanner(System.in);
                String eyes = eyeScanner.next();
                System.out.print("Место обитания: ");
                Scanner habitatScanner = new Scanner(System.in);
                String habitat = habitatScanner.next();
                System.out.print("Дата нахождения: ");
                Scanner dateFoundScanner = new Scanner(System.in);
                String dateFound = dateFoundScanner.next();
                System.out.print("Является ли вожаком стаи?: ");
                Scanner leaderScanner = new Scanner(System.in);
                String leader = leaderScanner.next();
                Animal newWolf = new Wolf(height, weight, eyes, habitat, dateFound, leader);
                System.out.printf("\nВы добавили волка со следующими характеристиками: %s", newWolf);
                animals.add(newWolf);
            }
            if (addNumber == 5) {
                System.out.print("\nРост: ");
                Scanner heightScanner = new Scanner(System.in);
                Double height = heightScanner.nextDouble();
                System.out.print("Вес: ");
                Scanner weightScanner = new Scanner(System.in);
                Double weight = weightScanner.nextDouble();
                System.out.print("Цвет глаз: ");
                Scanner eyeScanner = new Scanner(System.in);
                String eyes = eyeScanner.next();
                Animal newChiken = new Chicken(height, weight, eyes, 0);
                System.out.printf("\nВы добавили курицу со следующими характеристиками: %s", newChiken);
                animals.add(newChiken);
            }
            if (addNumber == 6) {
                System.out.print("\nРост: ");
                Scanner heightScanner = new Scanner(System.in);
                Double height = heightScanner.nextDouble();
                System.out.print("Вес: ");
                Scanner weightScanner = new Scanner(System.in);
                Double weight = weightScanner.nextDouble();
                System.out.print("Цвет глаз: ");
                Scanner eyeScanner = new Scanner(System.in);
                String eyes = eyeScanner.next();
                System.out.print("Высота полета: ");
                Scanner flyScanner = new Scanner(System.in);
                Integer fly = flyScanner.nextInt();
                Animal newStork = new Stork(height, weight, eyes, fly);
                System.out.printf("\nВы добавили аиста со следующими характеристиками: %s", newStork);
                animals.add(newStork);
            } else System.out.println("Такого номера нет в списке.");
        }
    }

    public static void getArray(ArrayList<Animal> animals) {

        for (int i = 0; i < animals.size(); i++) {
            System.out.printf("\n№ %s", i + 1 + " = " + animals.get(i).getClass().getSimpleName());
        }
    }

    public static void deleteElementsInArray(ArrayList<Animal> animals) {
        System.out.println("\nУкажите номер животного, которого хотите удалить: ");
        getArray(animals);
        Scanner bScanner = new Scanner(System.in);
        int delIndex = bScanner.nextInt();
        if (delIndex - 1 < animals.size()) {
            animals.remove(delIndex - 1);
            System.out.println("\nВ зоопарке остались следующие животные: ");
            getArray(animals);
            }
        else System.out.println("Такого номера нет в списке.");
        }

    public static void makeSoundAll(ArrayList<Animal> animals) {
        for(Animal animal: animals){
            animal.makeSound();
        }
    }

    public static void makeSound(ArrayList<Animal> animals) {
        System.out.println("\nУкажите номер животного, который издаст: ");
        getArray(animals);
        Scanner soundScanner = new Scanner(System.in);
        int sound = soundScanner.nextInt();
        if (sound - 1 <= animals.size()) {
            animals.get(sound - 1).makeSound();
        }
        else System.out.println("Такого номера нет в списке.");
    }

}
