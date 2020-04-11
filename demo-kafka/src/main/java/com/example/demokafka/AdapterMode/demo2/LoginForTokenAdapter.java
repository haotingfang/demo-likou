package com.example.demokafka.AdapterMode.demo2;

public class LoginForTokenAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
