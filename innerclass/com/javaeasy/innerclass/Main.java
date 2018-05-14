package com.javaeasy.innerclass;

public class Main {
    public static void main(String[] args) {
        UnStaticMethod a = new UnStaticMethod();
        System.out.println("+++++++++");
        a.method();
        UnStaticMethod.method2();

    }
}
