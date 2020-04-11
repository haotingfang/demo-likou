package com.example.demokafka.AdapterMode.demo2;

public interface LoginAdapter {
    boolean support(Object adapter);

    ResultMsg login(String id, Object adapter);
}
