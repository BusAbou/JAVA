/**
 * main program for the light class
 */
public class LightMain {
    /**
     * Main method that starts the application.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        /** create an instance of the LightBulb class*/
        LightBulb theBulb = new LightBulb(4, 1200, "white");
        /** display bulb description */
        System.out.println(theBulb.toString());
 
        /** turn on the light bulb */
        theBulb.turnOn();
        System.out.println(theBulb.toString());

        /** create a garland of 10 bulbs */
        LightString bulbs = new LightString(10);
        //LightSwitch switches = new LightSwitch(theBulb);

        /** the power it consumes, after turning it on */
        
        bulbs.turnOn();
        //switches.push();
        System.out.println("the power it consumes, after turning it on is: " + bulbs.getConsumedPower() + " W");

        /** replace the 4th bulb in this garland with a bulb */
        LightBulb fourthBulb = new LightBulb(2,120,"jaune");
        //LightSwitch Switches = new LightSwitch(fourthBulb);
        bulbs.changeLightbulb(4, fourthBulb);
        //Switches.push();

        System.out.println("the power it consumes, after replacement is: " + bulbs.getConsumedPower() + " W");

    }
}
