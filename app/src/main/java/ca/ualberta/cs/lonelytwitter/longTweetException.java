package ca.ualberta.cs.lonelytwitter;

public class longTweetException extends Exception {
    longTweetException() {
        super("The message exceeds limit of 140.");
    }
}
