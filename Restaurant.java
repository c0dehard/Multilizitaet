
package multilizitaet;

/**
 * @author c0dehard
 */

public class Restaurant {

	//Attribute
    public int counter;
    public String name;
    public Gast[] besucher;
    
    //Konstruktor
    public Restaurant(int hatSitze){
        besucher = new Gast[hatSitze];
        
    }
}
