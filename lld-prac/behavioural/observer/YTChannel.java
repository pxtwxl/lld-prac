package org.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public interface YTChannel {
    public void addSubscriber(Subscriber subscriber);
    public void removeSubscriber(Subscriber subscriber);
    public void notifySubscribers(String video);
}

class Channel1 implements YTChannel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String name;

    Channel1(String channelName) {
        this.name = channelName;
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void uploadVideo(String video) {
        System.out.println("Uploading new video : "+video+" , channel : "+this.name);
        notifySubscribers(video);
    }

    @Override
    public void notifySubscribers(String video) {
        for(Subscriber subscriber : subscribers) {
            subscriber.update(video);
        }
    }
}
