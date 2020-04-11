package com.example.demokafka.AdapterMode.demo2;
/*老的登录逻辑*/
public class SiginService {
    /**
     * 注册方法
     */
    public ResultMsg regist(String username,String password){
        return new ResultMsg(200,"注册成功",new Member());
    }
    /**
     * 登录的方法
     */
    public ResultMsg login(String username,String password){
        return null;
    }
}
