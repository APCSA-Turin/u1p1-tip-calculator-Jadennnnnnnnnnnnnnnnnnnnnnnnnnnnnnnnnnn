package com.example.project;

import java.text.DecimalFormat;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //Created a bunch of new variables to concatenate onto the strings
        double totalTip = cost * ((double) percent / 100);
        double totalBill =  totalTip + cost;
        double costPerPerson = cost / people ;
        double tipPerPerson = totalTip / people;
        double finalCost = totalBill / people;

        //https://docs.oracle.com/javase/8/docs/api/java/text/DecimalFormat.html for decimal formatting
        DecimalFormat df = new DecimalFormat("0.00");
        //https://www.naukri.com/code360/library/methods-to-print-new-line-in-java used to find out how to create new lines
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + df.format(cost) + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + df.format(totalTip) + "\n");
        result.append("Total Bill with tip: $" + df.format(totalBill) + "\n");
        result.append("Per person cost before tip: $" + df.format(costPerPerson) + "\n");
        result.append("Tip per person: $" + df.format(tipPerPerson) + "\n");
        result.append("Total cost per person: $" + df.format(finalCost) + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12;
        int percent = 15;
        double cost = 566.97;        
        System.out.println(calculateTip(people, percent, cost));
    }
}
        
