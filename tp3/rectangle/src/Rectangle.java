/**
 * a Rectangle class that allows you to represent rectangles
 */

 public class Rectangle {
    /** the length of the rectangle */
    private double lengthR;
    /** the width of the rectangle */
    private double widthR;

    /**
     * the construction of a Rectangle object
     * 
     * @param len the length of the rectangle
     * @param w the width of the rectangle
     */
    public Rectangle(double len, double w){
        this.lengthR = len;
        this.widthR = w;
    }

    /**
     * the length of the rectangle
     * @return lenghtR 
     */
    public double getLength(){
        return this.lengthR;
    }

    /**
     * the width of the rectangle
     * @return widthR
     */
    public double getWidth(){
        return this.widthR;
    }

    /**
     * the area of the rectangle
     * @return the area.
     */
    public double area(){
        return this.lengthR * this.widthR;
    }

    /**
     * calculate the perimeter of the rectangle
     * @return the perimeter.
     */
    public double perimeter(){
        return 2*(this.lengthR + this.widthR);
    }

    /**
     * the length of the diagonals
     * @return len.
     */
    public double diagonalLength(){
        return Math.sqrt(this.lengthR*this.lengthR + this.widthR*this.widthR);
    }

    /**
     * this rectangle is a square or not
     */
    public boolean isSquare(){
        return this.lengthR == this.widthR;
    }

    /**
     * this rectangle is “bigger” than another
     * @return true or false, if its area is greater than that of the other
     */
    public boolean isBiggerThan(Rectangle rec){
        return this.area() > rec.area();
    }

    /**
     * to establish the equality of this rectangle with another object
     * 
     * @param o parameter
     * @return true if they are equal or false if not
     */
    public boolean equals(Object o){
        if(!(o instanceof Rectangle)) return false;
        
        Rectangle other = (Rectangle) o;
        return this.lengthR == other.lengthR && this.widthR == other.widthR;
    }

    /**
     * a string that describes this rectangle
     * 
     * @return a string
     */
    public String toString(){
        return "For this rectangle, his length is " + this.lengthR + " and his width is " + this.widthR;
    }
 }