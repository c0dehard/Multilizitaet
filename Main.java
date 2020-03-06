
package Multiplizitaet;

/**
 * @author c0dehard
 */

public class Main {

    public static void main(String[] args) {

        Restaurant r1 = new Restaurant(10);
        r1.name = "McFastFoodRestaurant";
        Restaurant bkrestaurant = new Restaurant(80);
        bkrestaurant.name = "TheKingOfBurger";
        
        
        
        Gast stammkunde = new Gast(bkrestaurant);
       
 
        
    }

}
