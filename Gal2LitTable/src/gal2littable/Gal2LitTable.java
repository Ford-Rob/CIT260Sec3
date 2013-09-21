/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gal2littable;

/**
 *
 * @author RFord
 */
public class Gal2LitTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double gallons; //number of gallons
        double liters; //number of liters
        int counter; //counter
        
        counter = 0; //init value of counter
        for (gallons =1; gallons<=100; gallons++) {
        liters = gallons * 3.7854; //convert to liters
        System.out.println(gallons + " gallons is " + liters + " liters."); 
        
        counter++;
        // break up table by 10s
        if (counter == 10) {
            System.out.println();
            counter=0; //reset counter
        }
        }
    }}

