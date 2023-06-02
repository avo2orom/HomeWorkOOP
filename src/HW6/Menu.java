package HW6;

import java.util.Scanner;

public class Menu {
    public static void Menu() {
        functions menu = new functions();

        String file = "notes.txt";

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Please make your choice and enter a number");
            System.out.println("Menu");
            System.out.println("1 - Save note");
            System.out.println("2 - Load notes from file");
            System.out.println("3 - Add note");
            System.out.println("4 - Edit note");
            System.out.println("5 - Remove note");
            System.out.println("6 - Print all notes");
            System.out.println("7 - Print note by ID");
            System.out.println("8 - Exit");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    menu.saveNotesToFile();
                    break;
                case 2:
                    menu.loadNotes();
                    break;
                case 3:
                    menu.addNote();
                case 4:
                    System.out.println("Enter note's ID");
                    int ID = sc.nextInt();
                    menu.editNoteByID(ID);
                    break;
                case 5:
                    System.out.println("Enter note's ID");
                    int delID = sc.nextInt();
                    menu.deleteNotesById(delID);
                    break;
                case 6:
                    menu.printAllNotes();
                    break;
                case 7:
                    System.out.println("Enter note's ID");
                    int readID = sc.nextInt();
                    menu.readNoteBeId(readID);
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice. Try better");
            }
        }
    }
}
