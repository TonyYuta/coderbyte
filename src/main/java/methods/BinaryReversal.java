package methods;

import java.util.Scanner;

/**
 * Binary Reversal
 * Have the function BinaryReversal(str) take the str parameter being passed, which will be a positive integer,
 * take its binary representation (padded to the nearest N * 8 bits), reverse that string of bits,
 * and then finally return the new reversed string in decimal form. For example: if str is "47" then
 * the binary version of this integer is 101111 but we pad it to be 00101111. Your program should reverse
 * this binary string which then becomes: 11110100 and then finally return the decimal version of this string,
 * which is 244.
 *
 * Examples
 * Input: "213"
 * Output: 171
 *
 * Input: "4567"
 * Output: 60296
 */
public class BinaryReversal {

    public static String BinaryReversal(String str) {
        // code goes here
        int bites = Integer.parseInt(str)<256?8:16;
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(Integer.valueOf(str))).reverse();
        while(sb.length()<bites) {
            sb.append("0");
        }
        return String.valueOf(Integer.parseInt(sb.toString(), 2));
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(BinaryReversal(s.nextLine()));
    }
}
