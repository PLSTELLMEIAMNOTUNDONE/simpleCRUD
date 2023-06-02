package org.example.models;

import java.util.Date;

public class Car implements Identity {
    private int id;
    private String name;
    private String modelInf;
    private int age;
    private int price;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void update(Identity identity) {
        this.age=identity.getAge();
        this.name=identity.getName();
        this.price=((Car)identity).getPrice();
        this.modelInf=((Car)identity).getModelInf();
    }

    public int getPrice() {
        return this.price;
    }
    public String getModelInf() {
        return this.modelInf;
    }
    public String getInfo(){
        return ""+
                "\n name:  "+this.name +
                "\n age:  "+this.age +
                "\n modelInf:  "+this.modelInf +
                "\n price:  "+this.price ;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }
    @Override
    public void setAge(int age) {
        this.age=age;
    }

    @Override
    public void setId(int id) {
        this.id=id;
    }

    public Car(String name,int age,String modelInf,int price){
        this.name=name;
        this.age=age;
        this.modelInf=modelInf;
        this.price=price;
    }
    public Car(Car car){
        this.name=car.name;
        this.age=car.age;
        this.modelInf=car.modelInf;
    }
    public Car(){
        this.name="Car";
        this.age=-1;
        this.modelInf="no inf";
    }
}
