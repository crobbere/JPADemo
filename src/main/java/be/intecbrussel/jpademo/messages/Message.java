package be.intecbrussel.jpademo.messages;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {
    @Id
    private int id;
    private String message;

    public Message(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public Message() {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
