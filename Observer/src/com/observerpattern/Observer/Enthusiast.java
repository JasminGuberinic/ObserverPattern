package com.observerpattern.Observer;

public class Enthusiast implements  Subscriber {
    @Override
    public void Notify() {
        System.out.println("Enthusiast is Notified");
    }
}
