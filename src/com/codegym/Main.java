package com.codegym;

import jdk.net.SocketFlow;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Fan fan1 = new Fan(3,true,"green",10);
        Fan fan2 = new Fan(2,false,"black",5);
        Fan fan3 = new Fan();
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        fan3.setOn(true);
        System.out.println(fan3.toString());
    }
}
