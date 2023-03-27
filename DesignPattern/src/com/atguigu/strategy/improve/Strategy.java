package com.atguigu.strategy.improve;

/**
 * @author liqiuliang
 * @create 2022-10-06 2:45
 */
public interface Strategy {
    public void draw(int radius, int x, int y);
}

class RedPen implements Strategy {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("�ú�ɫ�ʻ�ͼ��radius:" + radius + ", x:" + x + ", y:" + y);
    }
}

class GreenPen implements Strategy {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("����ɫ�ʻ�ͼ��radius:" + radius + ", x:" + x + ", y:" + y);
    }
}

class BluePen implements Strategy {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("����ɫ�ʻ�ͼ��radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
