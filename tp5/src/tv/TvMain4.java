package tv;

import io.Input;
import java.io.IOException;


public class TvMain4 {

    public static void main(String[] args) {

        System.out.print("Enter the TV brand: ");
        String brand = Input.readString();

        Tv tv = new Tv(brand);

        tv.on();

        System.out.println("Current TV status : " + tv);

        boolean ok = false;
        while (!ok) {
            try {
                System.out.print("Enter a channel number (> 0) : ");
                int channel = Input.readInt();
                if (channel > 0) {
                    tv.changeChannel(channel);
                    ok = true;
                } else {
                    System.out.println("The channel number must be greater than 0.");
                }
            } catch (IOException e) {
                System.out.println("Error: Please enter a valid integer.");
            }
        }

        System.out.println("New TV status: " + tv);
    }
}
