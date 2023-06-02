package org.example.models;

import java.util.Date;
public class Human implements Identity {
    private int id=-1;
    private String name;
    private int age;
    private String work;
    private char sex;

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

    public String getWork() {
        return this.work;
    }
    public char getSex() {
        return this.sex;
    }

    public String getInfo(){
        return ""+
                "\n name:  "+this.name +
                "\n age:  "+this.age +
                "\n work:  "+this.work +
                "\n sex:  "+this.sex ;
    }
    @Override
    public void update(Identity identity) {
        this.age=identity.getAge();
        this.name=identity.getName();
        this.sex=((Human)identity).getSex();
        this.work=((Human)identity).getWork();
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

    public void setSex(char sex) {
        this.sex=sex;
    }
    public void setWork(String work) {
        this.work=work;
    }
    public Human(String name,int age,String work,char sex){
        this.name=name;
        this.age=age;
        this.work=work;
        this.sex=sex;
    }
    public Human(String name,int age,char sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    public Human(Human human){
        this.name= human.name;
        this.age= human.age;
        this.work= human.work;
        this.sex= human.sex;
    }
    public Human(){
        this.name="Human";
        this.age= -1;
        this.work= "no inf";
        this.sex= '0';

    }
}
