package com.atguigu.singleton.type9;

/**
 * @author liqiuliang
 * @create 2022-10-03 22:10
 */
public class HPComputer extends Computer {
    @Override
    public void print() {
        System.out.println("HPComputer");
    }
}
class DellComputer extends Computer{

    @Override
    public void print() {
        System.out.println("DellComputer");
    }
}
