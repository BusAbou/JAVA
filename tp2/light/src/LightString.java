/**
 * We want to create a LightString class to model such garlands.
 */
public class LightString {
    /** an attribute of type array of LightBulb objects */
    private LightBulb [] theBulb;
    /** status the lightString */
    private boolean ISON;

    /**
     * constructor of the LightString class
     * @param nbBulbs The number of bulbs that make up the garland is specified when it is created.
     */
    public LightString(int nbBulbs){
        theBulb = new LightBulb [nbBulbs];
        for (int i = 0; i < nbBulbs; i++) {
            theBulb[i] = new LightBulb(1, 100, "blanche");
        }
        this.ISON = false;
    }

    /**
     * we want to have a getLightBulb() method that allows us to obtain the i th bulb in the string
     * @param i a variable for the condition
     * @return if the condition is met we decrement i by 1 or otherwise null
     */
    public LightBulb getLightBulb(int i){
        if(i >= 1 && i <= theBulb.length){
            return this.theBulb[i-1];
        }
        return null;
    }

    /** replace the n-th lightbulb of the light string by the given lightbulb.
     * Nothing happens if i is not a valid index.
     * @param i the number of the lightbulb to be changed (first has number 1)
     * @param theBulbs the new lightbulb
     */
    public void changeLightbulb(int i, LightBulb theBulbs){
       if(i >= 1 && i <= theBulb.length){
          theBulb[i-1] = theBulbs;
       }
    }

    /**
     * provides as a result the total power expressed in Watts
     * consumed by the bulbs in the string.
     * @return total power when it is lit, and 0 otherwise
     */
    public int getConsumedPower(){
        if(! this.ISON) return  0;
        int totalPower = 0;
        for(LightBulb bulb : this.theBulb){
           totalPower += bulb.getWatt();
        }
        return totalPower;
    }

    /**
     * allows you to light a garland
     */
    public void turnOn(){
        this.ISON = true;
        for(LightBulb bulb : this.theBulb){
            bulb.turnOn();
        }
    }

    /**
     * a method of turning off a light bulb
     */
    public void turnOff(){
        this.ISON = false;
        for(LightBulb bulb : this.theBulb){
            bulb.turnOff();
        }
    }
}
