package com.observerpattern.Observer;

public class User implements Subscriber {
    @Override
    public void Notify(){
        System.out.println("Subscriber is Notified");
    };
}
