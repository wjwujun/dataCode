package com.wj.fib;

public class fibTest {

    /*
    *  斐波那契数
    * 0 1 1 2 3 5 8 ......
    * */


    //递归法
    public static  int fib1(int num){
        if(num<=1) return num;
        return fib1(num -1) +fib1(num -2);

    }

    //求一个斐波拉契数
    public static void main(String[] args) {
        System.out.println(fib1(3));
    }
}
