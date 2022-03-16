package com.codegym.pack;

import com.codegym.mypack.A;

public class B{
    public static void main(String[] args) {

        //private access modifier
        //chỉ truy cập được ở trong class
//        A a = new A();
//        a.data;
//        a.msg();


        //default
        //chỉ truy cập được ở trong cùng 1 package
//        A a = new A;
//        a.data;
//        a.msg();
//
        //protected
        //truy cập được trong và ngoài package thông qua việc extends
//        B a = new B();
//        a.msg();

        //public truy cập ở every where
//        A a = new A;
//        a.msg();
    }
}
