package org.example.models;

public interface Identity {
    public  String getName();
    public int getAge();
    public int getId();
    public  void update(Identity identity);
    public void setName(String name);
    public  void setAge(int age);
    public void setId(int id);
}
