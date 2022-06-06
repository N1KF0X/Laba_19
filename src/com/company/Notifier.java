package com.company;

public interface Notifier {
    void NotifyAllSubscribers();

    void addSubscriber(User user);
}
