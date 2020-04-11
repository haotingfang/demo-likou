package com.example.demokafka.EventAdvice;


import com.example.demokafka.EventAdvice.mouseevent.Mouse;
import com.example.demokafka.EventAdvice.mouseevent.MouseEventCallback;
import com.example.demokafka.EventAdvice.mouseevent.MouseEventType;

/**
 * Created by Tom on 2019/3/17.
 */
public class MouseEventTest {
    public static void main(String[] args) {

        MouseEventCallback callback = new MouseEventCallback();

        Mouse mouse = new Mouse();

        //@谁？  @回调方法
        mouse.addLisenter(MouseEventType.ON_CLICK,callback);
        mouse.addLisenter(MouseEventType.ON_FOCUS,callback);

        mouse.click();

        mouse.focus();


    }
}
