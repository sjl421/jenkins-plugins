package com.croydondias.helloworld;

import java.util.List;

/**
 * Created by croydon on 2/7/17.
 */
public class Person {

    private String name;
    private List<String> phones;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}
