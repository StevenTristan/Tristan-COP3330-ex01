/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Steven Tristan
 */

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args){
        System.out.println("What is your name?");
        Scanner s = new Scanner(System.in);
        String Name;
        Name = s.next();
        System.out.println("Hello, " +Name+ ", nice to meet you!");
    }

}
