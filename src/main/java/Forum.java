import java.util.ArrayList;
import java.util.List;

public class Forum {

    private static Forum instance = null;
    private List<Topic> allTopics = new ArrayList<>();
    private List<Comment> allComments = new ArrayList<>();

    private Forum() {

    }

    public static Forum getInstance() {
        if (instance == null) {
            instance = new Forum();
        }
        return instance;
    }

    public void addTopic(Topic topic) {
        allTopics.add(topic);
    }

    public List<Topic> getAllTopics() {
        return this.allTopics;
    }

    public List<Comment> getAllComments() {
        return allComments;
    }

    public void addComment(Comment comment) {
        allComments.add(comment);
    }


    public static void main(String[] args) {
        System.out.println("Started.");

        Forum forum = Forum.getInstance();

        Topic food = new Topic("pizza", "requires pineapple");
        System.out.println("food id: " + food.getId());
        Comment first = new Comment(food.getId(), "wow");
        System.out.println("topic id: " + first.getTopicId() + " mod: " + first.getModerated());
        Comment second = new Comment(food.getId(), "italian noises");
        System.out.println("topic id: " + second.getTopicId() + " mod: " + second.getModerated());


        forum.addTopic(food);
        System.out.println("forum all topics size: " + forum.getAllTopics().size());

        forum.addComment(first);
        forum.addComment(second);
        System.out.println("forum all comments size: " + forum.getAllComments().size());

        first.toggleModeration();
        System.out.println("Moderation toggled for 'first'.");
        System.out.println("topic id: " + first.getTopicId() + " mod: " + first.getModerated());

        // evaluate moderated comments and print them
        List<Comment> toPrintFoodComments = food.getModeratedComments();
        System.out.println(toPrintFoodComments.size());
        for (Comment item : toPrintFoodComments) {
            System.out.println(item.getMessage());
        }

    }



}
