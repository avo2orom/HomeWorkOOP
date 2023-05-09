package HW2;

import HW2.Methods.Methods;
import HW2.classes.Animal;
import HW2.classes.pets.Cat;
import HW2.classes.pets.Dog;
import HW2.classes.wild.Wolf;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        Animal animal1 = new Cat(0.3,2.5,"blue","Cloud", "Russian blue",
                "Yes", "grey", "30.10.2020", "yes");
        Animal animal2 = new Dog(0.5,7.0,"brown","Fillo","Kolly",
                "Yes","multy","12/06/2022", "Yes");
        Animal animal3 = new Wolf(0.5, 10.0,"gray","forest",
                "08/05/2022","no");
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);

        Methods.methods((ArrayList<Animal>) animals);

    }


}
