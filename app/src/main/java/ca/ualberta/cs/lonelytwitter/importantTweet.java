package ca.ualberta.cs.lonelytwitter;

public class importantTweet extends Tweet {
    importantTweet(){
        super();
    }
    importantTweet(String message){
        super(message);
    }


    @Override
    public Boolean isImportant() {
        return true;
    }

}
