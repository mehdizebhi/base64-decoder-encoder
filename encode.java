
import java.util.Scanner;

public class encode {
    
    public encode(){
         String input;
        Scanner cin = new Scanner(System.in);
        System.out.print("pls enter smth to encode base64 :");
        input = cin.nextLine();

        String output = "";
        int cToB64 = 0;
        int counter = 0;
        String chart = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

        for (int i = 0; i < input.length(); i++) {
            char c;
            c = input.charAt(i);
            for (int j = 0; j < 8; j++) {
                int this_bit;
                this_bit = (c & 128) >> 7;
                cToB64 = cToB64 << 1;
                cToB64 = cToB64 | this_bit;

                counter++;
                c = (char) (c << 1);

                if (counter == 6) {
                    output += chart.charAt(cToB64);
                    cToB64 = 0;
                    counter = 0;

                }

            }
        }

        cToB64 = cToB64 << (6 - counter);
        if (input.length() % 3 == 1) {
            output = output + chart.charAt(cToB64) +"==";

        } else if (input.length() % 3 == 2) {

            output  = output + chart.charAt(cToB64) +"=";
        }

        System.out.println("the encode to base64 :" +output);
    }
    
}
