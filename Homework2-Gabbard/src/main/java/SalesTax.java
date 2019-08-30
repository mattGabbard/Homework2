/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mattg
 */

import java.math.RoundingMode;
import java.util.Scanner;
import java.text.DecimalFormat;

public class SalesTax {
    public static void main(String[] args) 
    {    
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the purchase price?");
        double purchPrice = scan.nextDouble();
        
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        double cSalesTax = purchPrice * .02;
        double sSalesTax = purchPrice * .04;
        
        System.out.println("Purchase price is $" + purchPrice);
        System.out.println("County sales tax is $" + df.format(cSalesTax));
        System.out.println("State sales tax is $" + df.format(sSalesTax));
    }
}
