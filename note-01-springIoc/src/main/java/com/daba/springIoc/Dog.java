package com.daba.springIoc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet{

    @Value("Sumu")
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void make_sounds() {
        System.out.println(name + ": Oof");
    }
}
