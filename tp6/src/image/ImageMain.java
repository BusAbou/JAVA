package image;

import image.util.ImageDisplayer;
import image.util.ImageLoader;

public class ImageMain {
    //private static final String CAT_IMAGE = "/images/chat.pgm";
    public static void main(String[] args) {
        //Image img = new Image(150, 150);
        //GrayColor gray = new GrayColor(128);
        //img.fillRectangle(20, 30, 30, 50, GrayColor.BLACK); 
        //img.fillRectangle(50, 100, 40, 40, new GrayColor(128)); 
        //img.fillRectangle(90,20,70,50,new GrayColor(200)); 
        
        if(args.length < 1){
            System.out.println("Please use : java ImageMain </images/fichier.pgm> [threshold]");
            return;
        }
        
        String myFile = args[0];

        Image Img = ImageLoader.loadPGM(myFile);

        int threshold = 20;
        if(args.length >= 2){
            try {
                threshold = Integer.parseInt(args[1]);
            }catch (NumberFormatException e) {
                System.out.println("Threshold not valid, please use the default 20");
            }
        }

        ImageDisplayer displayer = new ImageDisplayer();
        Image edges = Img.edgeExtraction(threshold);
        Image negative = Img.negative();
        displayer.display(Img, "Original", 100, 100);
        displayer.display(negative, "Negative", 450, 100);
        displayer.display(edges, "Edges", 750, 100);
    }
}