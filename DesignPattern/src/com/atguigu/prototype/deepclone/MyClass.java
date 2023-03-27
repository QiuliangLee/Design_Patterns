package com.atguigu.prototype.deepclone;


/**
 * @author Lucas
 * @create 2022-08-31 0:10
 */
class Temp implements Cloneable{
    String age;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Temp)super.clone();
    }
}
public class MyClass implements Cloneable {
    String name;
    Temp temp=new Temp();

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", templ=" + temp +
                '}';
    }

    public String getName() {
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        MyClass clone = (MyClass) super.clone();
        clone.temp= (Temp) temp.clone();
        return clone;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        MyClass myClass=new MyClass();
        myClass.setName("123");
        MyClass myClass2=(MyClass) myClass.clone();
        System.out.println(myClass.temp.hashCode());
        System.out.println(myClass2.temp.hashCode());
    }
}

