package com.atguigu.observer.improve;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //创建一个WeatherData
        WeatherData register = new WeatherData();
        register.registerObserver(new Observer() {
            @Override
            public void update(float temperature, float pressure, float humidity) {
                System.out.println("===百度网站====");
                System.out.println("***百度网站 气温 : " + temperature + "***");
                System.out.println("***百度网站 气压: " + pressure + "***");
                System.out.println("***百度网站 湿度: " + humidity + "***");
            }
        });
        register.registerObserver(new Observer() {
            @Override
            public void update(float temperature, float pressure, float humidity) {
                System.out.println("***Today mTemperature: " + temperature + "***");
                System.out.println("***Today mPressure: " + pressure + "***");
                System.out.println("***Today mHumidity: " + humidity + "***");
            }
        });
        register.setData(1, 1, 1);
    }
}
