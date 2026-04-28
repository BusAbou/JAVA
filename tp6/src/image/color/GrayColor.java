package image.color;

/**
 * la classe GrayColor
 */

 public class GrayColor {
    /** a constant black of the GrayColor type */
    public static final GrayColor BLACK = new GrayColor(0);

    /** a constant white of the GrayColor type */
    public static final GrayColor WHITE = new GrayColor(255);

    /** an integer for the gray level  */
    private final int grayLevel ;

    /**
     * constructor of GrayColor
     * 
     * @param gray for the gray level
     */
    public GrayColor(int gray){
        this.grayLevel = gray;
    }

    /**
     * get the level of the color
     * 
     * @return grayLevel the level of that color
     */
    public int getGrayLevel(){
        return this.grayLevel;
    }

    /**
     * check if two objects GrayLevl are equals
     * 
     * @param obj the second object
     * @return true if they are equals or false they are not
     */
    public boolean equals(Object obj){
        if (!(obj instanceof GrayColor)) return false;

        GrayColor other = (GrayColor) obj;

        return this.grayLevel == other.grayLevel;
    }
 }