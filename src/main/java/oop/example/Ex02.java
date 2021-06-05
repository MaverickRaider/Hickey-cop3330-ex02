
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Hickey
 */

package oop.example;

import java.util.Scanner;

public class Ex02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the input string? ");
        String name = scanner.nextLine();

        System.out.println(name + " has "+ name.length() +" characters");
    }
}