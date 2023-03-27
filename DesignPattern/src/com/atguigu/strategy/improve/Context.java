package com.atguigu.strategy.improve;

/**
 * @author liqiuliang
 * @create 2022-10-06 2:46
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeDraw(int radius, int x, int y) {
        strategy.draw(radius, x, y);
        System.out.println("strategy.draw(radius, x, y);");
    }
}