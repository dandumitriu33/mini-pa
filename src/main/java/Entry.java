import java.util.Date;

abstract public class Entry {
    private int id;
    private Date creationDate;
    private String message;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
