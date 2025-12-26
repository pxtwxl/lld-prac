package org.behavioural.observer;

public interface Subscriber {
    public void update(String video);
}

class BellIconSubscriber implements Subscriber {
    private String YoutubeAccount;

    BellIconSubscriber(String youtubeAccount) {
        this.YoutubeAccount = youtubeAccount;
    }

    @Override
    public void update(String video) {
        System.out.println("Youtube User : "+YoutubeAccount+" , Watching Video : "+video);
    }
}

class EmailSubscriber implements Subscriber {
    private String email;

    EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String video) {
        System.out.println("Email User : "+this.email+"Watching Video : "+video);
    }
}