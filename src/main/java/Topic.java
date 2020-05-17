import java.util.ArrayList;
import java.util.List;

public class Topic extends Entry {
    private int counter = 1;
    private int id;
    private String title;
    private String message;
    private List<Comment> moderatedComments = new ArrayList<>();

    public Topic(String title, String message) {
        super();
        this.id = counter;
        this.title = title;
        this.message = message;
    }

    {
        counter += 1;
    }

    public List<Comment> getModeratedComments() {
        System.out.println("Entered mod comment eval.");
        Forum forum = Forum.getInstance();
        for (Comment item : forum.getAllComments()) {
            System.out.println("Evaluating comment: " + item.getId());
            System.out.println("topic ID?: " + forum.getAllTopics().get(0));
            if (item.getTopicId()==forum.getAllTopics().get(0).getId() && item.getModerated()) {
                System.out.println("entered true");
                moderatedComments.add(item);
            }

        }
        return moderatedComments;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
