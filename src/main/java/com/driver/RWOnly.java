package com.driver;

public class RWOnly {
    private String name;
    public String setName(String name){
        this.name=name;
        return name;
    }
    public String  getName(){ return name;}
}
