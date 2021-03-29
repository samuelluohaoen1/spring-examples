package com.daba.service;

public interface UserService {
    void create();
    void read();
    void update();
    void delete();

    default int return1(){
        return 1;
    }
}
