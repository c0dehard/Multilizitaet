
package multilizitaet;

/**
 * @author c0dehard
 */

public class Gast {

    //Attribute
    public Restaurant gastgeber;

    //Konstruktor
    public Gast(Restaurant r) {
        gastgeber = r;
        r.counter++;
    }
}
