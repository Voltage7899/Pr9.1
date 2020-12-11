package com.company;

public class Main {
    public static void main(String [] args)
    {
        ConcreteFactory fab1=new ConcreteFactory();
        Complex com=fab1.CreateComplex(1,2);
        System.out.println(com);
        ConcreteFactory fab2=new ConcreteFactory();
        Complex com1=fab2.createComplex();
        System.out.println(com1);
        ConcreteFactory fab3=new ConcreteFactory();
        Complex com2=fab3.CreateComplex(5,2);
        System.out.println(com2);
    }
}
