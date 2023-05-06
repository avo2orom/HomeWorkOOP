package HW1;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Goods[] goods = {new Milk("Domik v derevne",80,1,"litr","1","3.2","10.05.2023" ),
                         new Lemonade("Chernogolovka", 76, 1, "litr", "1"),
                         new Bread("Borodinskyi", 105,1,"loaf", "10.05.2023", "rye"),
                         new Eggs("Okskoe", 254, 1, "eggs", "30.06.2023", 30),
                         new ToiletPaper("Zewa",103,1,"pack", 4,2),
                         new Diapers("Huggies", 500, 1,"pack", 1,true,3,200,400,"babys"),
                         new Pacifier("MatherCare", 150, 1, "pack", 1, true)};

        for (Goods Goods : goods){
            Program.getInfo(Goods);
        }

    }
}
