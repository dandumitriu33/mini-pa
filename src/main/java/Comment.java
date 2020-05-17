public class Comment {
    private int id;
    private int topicId;
    private int counter = 1;
    private boolean moderated;
    private String message;

    public Comment(int topicId, String message) {
        super();
        this.id = counter;
        this.topicId = topicId;
        this.message = message;
        this.moderated = false;
    }

    {
        counter++;
    }

    public void toggleModeration() {
        if (!this.moderated) {
            this.moderated = true;
        }
        else {
            this.moderated = false;
        }
    }

    public int getId() {
        return id;
    }

    public int getTopicId() {
        return this.topicId;
    }

    public boolean getModerated() {
        return this.moderated;
    }

    public String getMessage() {
        return message;
    }
}
