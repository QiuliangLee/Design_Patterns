package com.atguigu.singleton.type9;


/**
 * @author liqiuliang
 * @create 2022-10-03 22:11
 */
public class HPFactory implements Factory {

    public static void main(String[] args) {
        HPFactory hpFactory = new HPFactory();
        hpFactory.getComputer().print();
    }

    @Override
    public Computer getComputer() {
        return new HPComputer();
    }
}
