package com.atguigu.builder.improve;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("���ض�", "����")
                .setDisplay("����24��")
                .setKeyboard("�޼�")
                .setUsbCount(2)
                .build();
    }
}
