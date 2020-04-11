package com.example.demokafka.StrategyMode;

public class GroupbuyStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("拼团，满 20 人成团，全团享受团购价");
    }
}
