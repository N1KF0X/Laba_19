package com.company;

public class User implements Observer{
    private String name;

    public User(String name){
        this.name = name;
    }

    public void outputNotify(){
        System.out.println("Подписчик " + name + " оповещён");
    }
}
