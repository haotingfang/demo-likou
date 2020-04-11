package com.example.demokafka.GuavaAdvice;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {
    @Subscribe
    public void subscribe(String str){
//业务逻辑
        System.out.println("执行 subscribe 方法,传入的参数是:" + str);
    }



/*
    @Subscribe
*/
    public void subscribe1(String str){
//业务逻辑
        System.out.println("执行 subscribe1 方法,传入的参数是:" + str);
    }
}
