/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thach Vo
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        System.out.print("Enter the principal: ");
        Scanner principal = new Scanner(System.in);
        int principal1 = principal.nextInt();

        System.out.print("Enter the rate of interest: ");
        Scanner interest = new Scanner(System.in);
        double interest1 = interest.nextDouble();

        System.out.print("Enter the number of years: ");
        Scanner years = new Scanner(System.in);
        int years1 = years.nextInt();

        double totalinvest = principal1 * (1 + ((interest1 / 100) * 4));

        int finalinvest = (int)totalinvest;

        System.out.print("After "+years1+" years at "+interest1+"%, the investment will be worth $"+finalinvest+".");


    }
}
