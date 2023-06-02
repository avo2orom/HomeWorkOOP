package HW6;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class functions {

    private final ArrayList<Note> notes = new ArrayList<>();

    public void addNote() {
        int id = 0;

        if (!notes.isEmpty()) {
            Note lastNote = notes.get(notes.size() - 1);

            id = lastNote.getId() + 1;
        }

        System.out.println("Write title: ");
        String title = new Scanner(System.in).next();
        System.out.println("Write text: ");
        String text = new Scanner(System.in).next();

        Note note = new Note(id, title, text);

        notes.add(note);

        System.out.println("Your note successfully added ");
    }

    public Note findNoteById(int id) {
        for (Note note : notes) {
            if (note.getId() == id) {
                return note;
            }
        }
        return null;
    }

    public void editNoteByID(int id){
        Note note = findNoteById(id);

        if (note != null){
            System.out.println("Your note:");
            System.out.println();
            System.out.println(note);
            System.out.println();
            System.out.println("You really want to edit it?");
            System.out.println("Reply: 1 - Yes; 2 - No");
            int edit = new Scanner(System.in).nextInt();
            if (edit == 1){
                System.out.println("Write title: ");
                String title = new Scanner(System.in).next();
                System.out.println("Write text: ");
                String text = new Scanner(System.in).next();
                note.setHead(title);
                note.setText(text);
                System.out.println("Your note edited successfully!");
            }
            else {
                System.out.println("No notes was edited");
            }
        }
        else {
            System.out.println("There is no note with this id");
        }
    }

    public void printAllNotes() {
        if(notes.isEmpty()){
            System.out.println("No notes found. Please add");
        }
        else {
            for (Note note: notes){
                System.out.println(note.getId());
                System.out.println(note.getHead());
                System.out.println(note.getText());
                System.out.println();
            }
        }
    }

    public void saveNotesToFile() {
        try (FileOutputStream fos = new FileOutputStream("notes.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(notes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void loadNotes(){
        try (FileInputStream fis = new FileInputStream("notes.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            ArrayList<Note> readNotes = (ArrayList<Note>) ois.readObject();
            notes.clear();
            notes.addAll(readNotes);
            System.out.println("Notes upload successfully!");
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("File reading error");
        }
    }

    public void readNoteBeId(int id) {
        try (FileInputStream fis = new FileInputStream("notes.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            ArrayList<Note> readNotes = (ArrayList<Note>) ois.readObject();
            Note note = findNoteById(id);

            if (note != null) {
                System.out.println(note.getId());
                System.out.println(note.getHead());
                System.out.println(note.getText());
                System.out.println();
            } else {
                System.out.println("No notes found");
            }
        } catch (IOException | ClassNotFoundException e){
        e.printStackTrace();
        System.out.println("File reading error");
        }
    }

    public void deleteNotesById(int id){
        Note note = findNoteById(id);
        if (note != null){
            notes.remove(note);
            System.out.println("Your note successfully deleted");
        }
        else {
           System.out.println("No notes found");
        }
    }
}
