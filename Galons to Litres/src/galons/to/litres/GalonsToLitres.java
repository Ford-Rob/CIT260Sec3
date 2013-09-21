/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package galons.to.litres;

/**
 *
 * @author RFord
 */
public class GalonsToLitres {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        double gallons; //number of gallons
        double liters; //number of liters
        
        gallons = 10; //init value of gallons
        liters = gallons * 3.7854; //convert to liters
        System.out.print(gallons + " gallons is " + liters + " liters.");  
    }
}
