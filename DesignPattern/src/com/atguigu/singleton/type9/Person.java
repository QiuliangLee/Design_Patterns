package com.atguigu.singleton.type9;

/**
 * @author liqiuliang
 * @create 2022-10-03 13:50
 */
public class Person {
    private String name;
    private int age;

    class Brain {
        public void print() {
            System.out.println("我是" + name + "的脑子");
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Lucas";
        Brain brain = person.new Brain();
        brain.print();
    }

}
