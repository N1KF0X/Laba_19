package com.company;

public class Main {

    public static void main(String[] args) {
	    User user = new User("Данил");
        User user1 = new User("Антон");

        Public pub = new Public();
        pub.addSubscriber(user);
        pub.addSubscriber(user1);
        pub.NotifyAllSubscribers();

        Public pub1 = new Public();
        pub1.addSubscriber(user);
        pub1.addSubscriber(user1);
        pub1.NotifyAllSubscribers();

        Public pub2 = new Public();
        pub2.addSubscriber(user);
        pub2.addSubscriber(user1);
        pub2.NotifyAllSubscribers();

        Public pub3 = new Public();
        pub3.addSubscriber(user);
        pub3.NotifyAllSubscribers();
    }
}
