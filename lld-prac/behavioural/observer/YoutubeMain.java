package org.behavioural.observer;

public class YoutubeMain {
    public static void main(String[] args) {
        Subscriber ytSub = new BellIconSubscriber("YT Sub");
        Subscriber mailSub = new EmailSubscriber("mailSub");

        Channel1 channel = new Channel1("Youtube XYZ");
        channel.addSubscriber(ytSub);
        channel.addSubscriber(mailSub);
        channel.uploadVideo("World Top 10 ..");
    }
}
