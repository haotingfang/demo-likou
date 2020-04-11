package com.example.demolikou;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.JSONPObject;
import net.minidev.json.parser.JSONParser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoLikouApplicationTests {

    @Test
    void contextLoads() {
        float a=222222222222222222222222222222222222222.1f;
        float b=222222222222222222222222222222222222222.1f;

        System.out.println("a==b?"+(a==b));


        Integer c=2222;
        Integer d=2222;
        System.out.println("c==d?:"+(c==d));
    }

    /*获取无重复字符的最长子串*/
    /*暴力法 很慢 abcabcbb*/
   /* public int lengthOfSubstring(String s){
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                if(allUnique(s,i,j)) ans=Math.max(ans,j-i);
            }
        }
        return ans;
    }

    public boolean allUnique(String s,int start ,int end){
        Set<Character> set=new HashSet<>();
        for(int i=start,i<end;i++){
            Character ch=s.charAt(i);
            if(set.contains(ch)){
                return false;
            }
            set.add(sh);
        }
        return true;
    }
    *//*暴力法 很慢*//*

    *//*滑动窗口 abcabcbb*//*
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {

                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }*/
    /*滑动窗口*/

    /*获取无重复字符的最长子串*/

    //史上最牛 B 的单例模式的实现方式



}

