package com.observerpattern.Subject;

import com.observerpattern.Observer.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Subscriber> subscribers = new ArrayList<Subscriber>();

    public void Subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void UnSubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void NotifySubscribers(){
        for (Subscriber subscriber : subscribers) subscriber.Notify();
    }
}
