package com.atguigu.observer.improve;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //����һ��WeatherData
        WeatherData register = new WeatherData();
        register.registerObserver(new Observer() {
            @Override
            public void update(float temperature, float pressure, float humidity) {
                System.out.println("===�ٶ���վ====");
                System.out.println("***�ٶ���վ ���� : " + temperature + "***");
                System.out.println("***�ٶ���վ ��ѹ: " + pressure + "***");
                System.out.println("***�ٶ���վ ʪ��: " + humidity + "***");
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
