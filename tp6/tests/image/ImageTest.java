package image;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import image.Image;
import image.color.GrayColor;
import image.UnknownPixelException;

public class ImageTest {
    @Test 
    public void createImageSuccess() {
        Image image = new Image(8,8);
        assertEquals(8,image.getWidth());
        assertEquals(8,image.getWidth());

        for (int i = 0; i < image.getWidth(); i++){
           for (int j = 0; j < image.getHeight(); j++) {
               assertEquals(GrayColor.WHITE, image.getPixel(i, j).getColor());
           }
        }
    }

    @Test 
    public void checkPixelvalid() {
        Image image = new Image(8,8);
        assertNotNull(image.getPixel(0,0));
    }

    @Test 
    public void InvalidPixelThrowsException() {
        Image image = new Image(3, 4);
        assertThrows(UnknownPixelException.class, () -> image.getPixel(0,6));
    }

    @Test 
    public void changeColorPixel() {
        Image image = new Image(4, 4);
        GrayColor gray = new GrayColor(50);
        image.changeColorPixel(1, 1, gray);
        assertEquals(gray, image.getPixel(1, 1).getColor());
    }

    @Test 
    public void changeColorPixelInvalidThrowsException() {
        Image image = new Image(6,6);
        assertThrows(UnknownPixelException.class, () -> image.changeColorPixel(-1, 4, new GrayColor(100)));
    }

    @Test 
    public void fillRectangleSuccess(){
        Image image = new Image(8, 9);
        GrayColor gray = new GrayColor(80);
        image.fillRectangle(1, 2, 3, 2, gray);
        
        for (int i = 1; i < 1 + 3; i++) {
            for (int j = 2; j < 2 + 2; j++) {
                assertEquals(gray, image.getPixel(i, j).getColor());
            }
        }

        assertEquals(GrayColor.WHITE, image.getPixel(0, 0).getColor());
        assertEquals(GrayColor.WHITE, image.getPixel(4, 4).getColor());
    }

    @Test
    public void createNewNegativeImage(){
        Image img = new Image(2, 2);
        img.changeColorPixel(0, 0, new GrayColor(0));
        img.changeColorPixel(1,0, new GrayColor(100));
        img.changeColorPixel(0, 1, new GrayColor(200));
        img.changeColorPixel(1, 1, new GrayColor(255));

        Image negImg = img.negative();
        assertEquals(255, negImg.getPixel(0, 0).getColor().getGrayLevel());
        assertEquals(155, negImg.getPixel(1, 0).getColor().getGrayLevel());
        assertEquals(55, negImg.getPixel(0, 1).getColor().getGrayLevel());
        assertEquals(0, negImg.getPixel(1, 1).getColor().getGrayLevel());
    }

    @Test 
    public void createNewNegativeImageFullBlack(){
        Image img = new Image(3, 3);
        img.fillRectangle(0, 0, 3, 3, GrayColor.BLACK);

        Image negImg = img.negative();

        for(int i = 0; i < 3; i++){
            for(int j= 0; j < 3; j++){
                assertEquals(255, negImg.getPixel(j, i).getColor().getGrayLevel());
            }
        }
    }

    @Test 
    public void testEdgeExtraction() {
        Image img = new Image(3,3);

        img.changeColorPixel(1,1, new GrayColor(200));
        Image edges = img.edgeExtraction(50);

        assertEquals(GrayColor.BLACK, edges.getPixel(1,1).getColor());

        assertEquals(GrayColor.WHITE, edges.getPixel(0, 0).getColor());
        assertEquals(GrayColor.WHITE, edges.getPixel(2, 2).getColor());
    }
}
