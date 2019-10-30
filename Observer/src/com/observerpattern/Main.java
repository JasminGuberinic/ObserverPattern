package com.observerpattern;

import com.observerpattern.Observer.Enthusiast;
import com.observerpattern.Observer.Subscriber;
import com.observerpattern.Observer.User;
import com.observerpattern.Subject.Channel;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Channel channel = new Channel();

        Subscriber  user = new User();
        channel.Subscribe(user);

        Subscriber ethusiast = new Enthusiast();
        channel.Subscribe(ethusiast);

        channel.NotifySubscribers();
    }
}
