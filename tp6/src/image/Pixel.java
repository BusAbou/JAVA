package image;

import image.color.GrayColor;

/**
 * the pixel class
 */
public class Pixel {
    /** attribut color */
    private GrayColor color;

    /**
     * constructor of the class Pixel
     * 
     * @param color the color of that Pixel
     */
    public Pixel(GrayColor color){
        this.color = color;
    }

    /** 
     * get the color
     * 
     * @return color the color of the pixel
     */
    public GrayColor getColor(){
       return this.color;
    }

    /**
     * set the color of the pixel
     * 
     * @param color the new color of the pixel
     */
    public void setColor(GrayColor color){
        this.color = color;
    }

    /**
     * method equals, check if two object pixel are equals
     * 
     * @param obj the second object pixel to compare
     * @return true if they are equals or false otherwise
     */
    public boolean equals(Object obj){
        if(!(obj instanceof Pixel)) return false;

        Pixel other = (Pixel) obj;
        return this.color.equals(other.color);
    }

    /**
     * method colorLevelDifference, difference in the grayscales values
     * of this pixel and another pixel provided as a parameter
     * 
     * @param pixel the second pixel given an parameter
     * @return an integer.
     */
    public int colorLevelDifference(Pixel pixel){
        return Math.abs(this.color.getGrayLevel() - pixel.color.getGrayLevel());
    }
}
