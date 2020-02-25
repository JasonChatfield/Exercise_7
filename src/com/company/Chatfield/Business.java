package com.company.Chatfield;

/**
 * Created by 026649 on 2/25/2020.
 */
public class Business extends Contact {
    private String phone;


    public Business() {
    }

    public Business(String name, String email, String phone) {
        super(name, email);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("The Business Contacts phone number is "+phone);
    }
}
