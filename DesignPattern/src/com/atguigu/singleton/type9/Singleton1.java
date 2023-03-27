package com.atguigu.singleton.type9;

/**
 * @author liqiuliang
 * @create 2022-10-03 13:18
 */
public class Singleton1 {
    private final static Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}