package com.example.demokafka.AdapterMode.demo2;

public class LoginForWechatAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
