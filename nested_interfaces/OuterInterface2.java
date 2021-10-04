package com.nested_interfaces;

public interface OuterInterface2 {
    int data=10;
    class InnerClass{
        public void method(){
            System.out.println(data);
        }
    }
}
