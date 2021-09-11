/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thach Vo
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        int principal = scan.nextInt();

        System.out.print("Enter the rate of interest: ");
        double interest = scan.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scan.nextInt();

        double totalinvest = principal * (1 + ((interest / 100) * 4));

        int finalinvest = (int)totalinvest;

        System.out.print("After "+years+" years at "+interest+"%, the investment will be worth $"+finalinvest+".");

    }
}
