package com.company.Chatfield;

/**
 * Created by 026649 on 2/25/2020.
 */
public class Contact {
    public String name;
    public String email;

    public Contact() {
    }

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;}

    public void display(){
        System.out.println("The contacts name is "+name+" and their email is "+email);
    }


}




