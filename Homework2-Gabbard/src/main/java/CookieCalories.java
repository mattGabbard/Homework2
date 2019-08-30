/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mattg
 */
import java.util.Scanner;

public class CookieCalories 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many cookies did you eat? Don't lie.");
        int cookiesEaten = scan.nextInt();
        // probably should add 15 cookies. You ate more than 5 cookies, Karen.
        
        int cookiesReallyEaten = cookiesEaten + 15;
        if (cookiesReallyEaten > 40){
            cookiesReallyEaten = 40;}
        int calories = cookiesEaten * 75;
        int actualCalories = cookiesReallyEaten * 75;
        
        System.out.println("Cookies (claimed to have been) eaten: " + cookiesEaten);
        System.out.println("Calories (claimed to have been) consumed: " + calories);
        System.out.println("Cookies actually eaten: " + cookiesReallyEaten); 
        System.out.println("Calories actually consumed: " + actualCalories);
    }
}