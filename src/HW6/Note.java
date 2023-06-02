package HW6;

public class Note {
    private Integer id;
    private String head;
    private String text;


    public Note(Integer id, String head, String text) {
        this.id = id;
        this.head = head;
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
