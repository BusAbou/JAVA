/**
 * LightSwitch, whose objects represent electrical 
 * switches that control the switching on and off of 
 * a given (and only one) light bulb.
 */
public class LightSwitch {
    /** theBulb type LightBulb */
    private LightBulb theBulb;

    /** the constructor of the switch class
     * @param bulb the bulb
     */
    public LightSwitch(LightBulb bulb){
        this.theBulb = bulb;
    }

    /**
     * access the bulb controlled by the switch.
     * 
     * @return the bulb
     */
    public LightBulb getLightBulb(){
        return theBulb;
    }

    /**
     * press the switch, which changes the state of the bulb (on or off).
     */
    public void push(){
        if(this.theBulb.isOn()){
            theBulb.turnOff();
        } else {
            theBulb.turnOn();
        }
    }

}
