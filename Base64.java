
import java.util.Scanner;

public class Base64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        decode Decode;
        encode Encode;
        while (true) {
            System.out.print("enter 1 to decode & 2 to encode (-1 to exit):");
            int ch = 0;
            Scanner cin = new Scanner(System.in);
            ch = cin.nextInt();
            if (ch == 1) {

                System.out.println("***************welcome to decode base64***************");
                Decode = new decode();
            } else if (ch == 2 || ch > 2) {

                System.out.println("***************welcome to encode base64***************");
                Encode = new encode();
            } else if (ch == -1) {
                break;

            }

        }
    }

}
