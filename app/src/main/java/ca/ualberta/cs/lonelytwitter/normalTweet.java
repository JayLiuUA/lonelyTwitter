package ca.ualberta.cs.lonelytwitter;


public class normalTweet extends Tweet {
    normalTweet() {
        super();
    }

    normalTweet(String message) {
        super(message);
    }
    @Override
    public Boolean isImportant() {
        return false;
    }
}
