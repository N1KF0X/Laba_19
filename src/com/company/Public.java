package com.company;

import java.util.*;

public class Public implements Notifier{
    private ArrayList<User> subscribers = new ArrayList<>();

    public void NotifyAllSubscribers(){
        for (User user: subscribers) {
            user.outputNotify();
        }
    }
    public void addSubscriber(User user){
        subscribers.add(user);
    }
}
