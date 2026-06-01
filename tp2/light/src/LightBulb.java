/**
 * definition of the bulb class
 */
public class LightBulb{
    /** declare an integer for the electrical power for this bulb */
    private int power;
    /** declaration of an integer type lumens for luminous power */
    private int lumens;
    /** the string type lighting color */
    private String color;
    /** bulb status */
    private boolean on;

    /**
     * the constructor of the light bulb class
     * @param pow the power of the bulb
     * @param lum the lumens of the bulb
     * @param col the color of the bulb
     */
    public LightBulb(int pow, int lum, String col){
        this.power = pow;
        this.lumens = lum;
        this.color = col;
        this.on = false;
    }

    /**
     * get the power of the bulb in watts
     * @return power
     */
    public int getWatt(){
        return this.power;
    }

    /**
     * get the lumens of the bulb
     * @return lumens
     */
    public int getLumen(){
        return this.lumens;
    }

    /**
     * get the color of the bulb
     * @return color
     */
    public String getColor(){
        return this.color;
    }

    /**
     * turn on this bulb
     * @return true or false 
     */
    public boolean turnOn(){
        return this.on = true;
    }

    /**
     * turn this bulb off
     * @return true or false
     */
    public boolean turnOff(){
        return this.on = false;
    }

    /**
     * know if a bulb is on or off
     * @return true or false
     */
    public boolean isOn(){
        if(this.turnOn()){
            return this.on = true;
        }else {
            return this.on = false;
        }
    }

    /**
     * a string description of a light bulb
     * The on or off status of the bulb is mentioned by this description
     */
    public String toString(){
        String message;
        if(this.on){
            message = "the bulb is on";
        }else{
            message = "the bulb is off";
        }

        if(turnOn()) {
            return "the power of this bulb is " + this.power + 
               " , the light power it produces is " + this.lumens +
               " , its lighting color is " + this.color +
               " "+ message ; 
        }else{
            return "the power of this bulb is " + this.power + 
               " , the light power it produces is " + this.lumens +
               " , its lighting color is " + this.color+
               " ,"+ message ; 
        }
    }
}