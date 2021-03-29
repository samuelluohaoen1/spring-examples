package com.daba.service;

public class UserServiceImpl implements UserService{

    // Will run only once no matter how many objects were created
    static{
        System.out.println("MAGIC!");
    }

    @Override
    public void create() {
        System.out.println("Creating an entry");
    }

    @Override
    public void read() {
        System.out.println("Reading an entry");
    }

    @Override
    public void update() {
        System.out.println("Updating an entry");
    }

    @Override
    public void delete() {
        System.out.println("Deleting an entry");
    }

    @Override
    public int return1() {
        return 10;
    }
}
