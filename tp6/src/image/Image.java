package image;

import image.color.GrayColor;
/**
 * object image that represent our images
 */
public class Image implements ImageInterface {
    /** attribut heigth for the image */
    private int heigth;
    /** attribut width for the image */
    private int width;
    /** attribut pixels that make up the image */
    Pixel [][] pixels;

    /**
     * constructor the object image
     * 
     * @param h an integer for the heigth of the image
     * @param w an integer for th width of the image.
     */
    public Image(int w, int h){
        this.heigth = h;
        this.width = w;
        this.pixels = new Pixel[w][h];

        for(int i = 0; i < this.width; i++){
            for (int j= 0; j < this.heigth; j++){
                this.pixels[i][j] = new Pixel(GrayColor.WHITE);
            }
        }
    }

    /**
     * get the width of the image
     * 
     * @return width of that image
     */
    public int getWidth(){
        return this.width;
    }

    /**
     * get the heigth of the image
     * 
     * @return height of that image
     */
    public int getHeight(){
        return this.heigth;
    }

    /** get the pixel at coordinates (x,y) for this image. (0,0) is top left corner pixel.
      * @param x the horizontal coordinate
      * @param y the vertical coordinate
      * @return pixel at coordinates (x,y) for this image.
      * @exception UnknownPixelException if pixel at coordinates (i,j) does not exist for this image.
    */
    public Pixel getPixel(int x, int y){
        if(x < 0 || x >= this.width || y < 0 || y >= this.heigth){
            throw new UnknownPixelException("not valid pixel");
        }
        return this.pixels[x][y];
    }

    /**
     * change the color of the pixel with coordinates (x,y) by assigning it the color color.
     * @param x the horizontal coordinate
     * @param y the vertical coordinate
     * @param color of the color to assign
     */
    public void changeColorPixel(int x, int y, GrayColor color) throws UnknownPixelException {
        this.getPixel(x, y).setColor(color);
    }
    
    /**
     * This method modifies the image content to draw a rectangle
     * in which all pixels are the color color.
     * @param x the horizontal coordinate
     * @param y the vertical coordinate
     * @param width the width of the image
     * @param height of the image
     * @param color of the color to assign
     */
    public void fillRectangle(int x, int y, int width, int height, GrayColor color){
        for (int i = x; i < x + width; i++) {
            for (int j = y; j < y + height; j++){
                if (i >= 0 && i < this.width && j >= 0 && j < this.heigth){ 
                    this.pixels[i][j].setColor(color); 
                }
            }
        }
    }

    /**
     * create a negative image
     * 
     * @return neg the negative image
     */
    public Image negative(){
        Image neg = new Image(width, heigth);
        for(int i = 0; i < this.width; i++){
            for(int j = 0; j < this.heigth; j++){
                int l = getPixel(i, j).getColor().getGrayLevel();
                GrayColor col = new GrayColor(255-l);
                neg.changeColorPixel(i, j, col);
            }
        }
        return neg;
    }

    /**
     * create a new image obtained from the initial image by edge extraction
     * 
     * @param threshold the "threshold" for detecting the aforementioned contours.
     * @return a new image containing the detected contours
     */
    public Image edgeExtraction(int threshold) {
        Image result = new Image(this.width, this.heigth);

        for(int i = 0; i < this.width - 1; i++){
            for(int j = 0; j < this.heigth - 1; j++){
                int current = this.getPixel(i,j).getColor().getGrayLevel();
                int right = this.getPixel(i + 1, j).getColor().getGrayLevel();
                int down = this.getPixel(i, j + 1).getColor().getGrayLevel();

                if(Math.abs(current - right) > threshold || Math.abs(current - down) > threshold){
                    result.changeColorPixel(i, j, GrayColor.BLACK);
                }
            }
        }
        return result;
    }
}