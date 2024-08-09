package org.example.models;

public class Person {
    private String name;
    private int age;
    //constructor
    public Person (){
        this.name = "";
        this.age = 0;
    }

    //getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    //setters
    public void setName(String newName){
        this.name = newName;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }


}

