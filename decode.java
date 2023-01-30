
import java.util.Scanner;


public class decode {
    
    public decode(){
           String input;
        Scanner cin = new Scanner(System.in);
        System.out.print("pls enter smth to decode base64 :");
        input = cin.nextLine();

        String output = "";
        int b64ToC = 0;
        int counter = 0;
        String indxC = "";
        String sumIndx = "";
        String chart = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

        for (int i = 0; i < input.length(); i++) {
            char c;
            c = input.charAt(i);

            for (int j = 0; j < 64; j++) {
                if (c == chart.charAt(j)) {
                    indxC = Integer.toBinaryString(j);
                    for (int n = 0; n < (6 - indxC.length()); n++) {
                        sumIndx += "0";
                    }
                    sumIndx = sumIndx + indxC;
                    break;
                } else if (c == '=') {
                    counter++;
                    break;
                }
            }
        }

        String s = "";
        int h1 = 0;
        int indx8 = 0;
        System.out.print("the decode from base64 :");
        for (int k = 0; k < (sumIndx.length() - (counter * 2)) / 8; k++) {

            for (int h = 0; h < 8; h++) {
                s += sumIndx.charAt(h + h1);
            }
            indx8 = Integer.parseInt(s,2);
            char c;
            c = (char) indx8;
            System.out.print(c);
            h1 = h1 + 8;
            s = "";

        }
        System.out.println("");
    }
    
}
