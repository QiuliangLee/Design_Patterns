package com.atguigu.strategy.improve;

import java.util.Arrays;
import java.util.Comparator;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new BluePen()); // ʹ����ɫ������
        context.executeDraw(10, 0, 0);
    }
}
