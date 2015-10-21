package com.daniel.annotation;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReadWriteLock;

/**
 * Created by daniel on 15/10/14.
 */
public class TestMain {
    public static void main(String[] args){
        TestMain test =new TestMain();
        test.compare1();
        test.compare2();

    }
    public void compare1(){

        Boolean a = new Boolean(Boolean.TRUE);
        Boolean b = new Boolean(Boolean.TRUE);;
        System.out.print(a==b);
    }

    public void compare2(){
        Boolean a = new Boolean("true");
        Boolean b = new Boolean("true");
        System.out.print(a==b);

    }
    int a = 2147483647;
    Integer b = new Integer(999999999);

}
