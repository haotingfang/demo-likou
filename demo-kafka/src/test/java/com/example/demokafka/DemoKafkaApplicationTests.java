package com.example.demokafka;

import com.example.demokafka.AdapterMode.demo1.AC220;
import com.example.demokafka.AdapterMode.demo1.DC5;
import com.example.demokafka.AdapterMode.demo1.PowerAdapter;
import com.example.demokafka.AdapterMode.demo2.IPassportForThird;
import com.example.demokafka.AdapterMode.demo2.PassportForThirdAdapter;
import com.example.demokafka.AdapterMode.demo2.SigninForThirdService;
import com.example.demokafka.GuavaAdvice.GuavaEvent;
import com.example.demokafka.StrategyMode.CashbackStrategy;
import com.example.demokafka.StrategyMode.CouponStrategy;
import com.example.demokafka.StrategyMode.PromotionActivity;
import com.example.demokafka.StrategyMode.PromotionStrategyFactory;
import com.example.demokafka.TemplateMode.MemberDao;
import com.example.demokafka.gperadvice.GPer;
import com.example.demokafka.gperadvice.Question;
import com.example.demokafka.gperadvice.Teacher;
import com.google.common.eventbus.EventBus;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoKafkaApplicationTests {

    /*策略模式*/
    @Test
    void contextLoads() {
        PromotionActivity promotionActivity = null;
        String promotionKey = "COUPON";
        if ("COUPON".equals(promotionKey)) {
            promotionActivity = new PromotionActivity(new CouponStrategy());
        } else if ("CASHBACK".equals(promotionKey)) {
            promotionActivity = new PromotionActivity(new CashbackStrategy());
        }//......
         promotionActivity.execute();
    }

    /*策略模式*/
    @Test
    public void  yy(){
        String promotionKey = "GROUPBUY";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.execute();
    }

    /*模板模式*/
    @Test
    public void templateMode(){
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
        System.out.println(result);
    }


    @Test
    public void hh(){
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }

    /*适配器模式1*/
    @Test
    public void  adapterMode(){
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outputDC5V();
    }

    /*适配器模式2*/
    @Test
    public void  gg(){
        SigninForThirdService service = new SigninForThirdService();
//不改变原来的代码，也要能够兼容新的需求
//还可以再加一层策略模式
        service.loginForQQ("sdfgdgfwresdf9123sdf");
    }

    /*适配器模式3*/
    @Test
    public void  qqqq(){
        IPassportForThird passportForThird = new PassportForThirdAdapter();
        passportForThird.loginForQQ("");
    }

    /*观察者模式JDK*/
    @Test
    public void  tt(){
        GPer gper = GPer.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");
        gper.addObserver(tom);
        gper.addObserver(mic);
//业务逻辑代码
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者模式适用于哪些场景？");
        gper.publishQuestion(question);
    }


    @Test
    public void guavaTest() {
        EventBus eventbus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventbus.register(guavaEvent);
        eventbus.post("Tom");
    }


}
