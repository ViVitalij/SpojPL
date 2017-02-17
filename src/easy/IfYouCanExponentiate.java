package easy;

import java.io.*;

/**
 * Wyswietla, na podstawie wpisanych podstawy i wykladnika potegi,
 * ostatnia cyfre potegowania (tak naprawde bez jego wykonywania, a sprawdzajac ostatnia liczbe podstawy(modulo%10))
 *
 * @author m.losK
 * @version 4.0
 */

public class IfYouCanExponentiate {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTests = getNumberOfTestsFromUser(in);
        for (int t = 0; t < numberOfTests; t++) {
            int[] baseAndExponent = parseInt(in);
            int baseLastDigit = baseAndExponent[0] % 10;
            int exponent = baseAndExponent[1];
            printLastDigitOfExponentiation(baseLastDigit, exponent);
        }
    }

    public static int getNumberOfTestsFromUser(BufferedReader in) throws IOException {
        String tmp = in.readLine();
        return Integer.parseInt(tmp);
    }

    public static int[] parseInt(BufferedReader in) throws IOException {
        String tmp = in.readLine();
        String[] tmpArray;
        tmpArray = tmp.split(" ");
        int[] baseAndExponent = new int[2];
        baseAndExponent[0] = Integer.parseInt(tmpArray[0]);
        baseAndExponent[1] = Integer.parseInt(tmpArray[1]);
        return baseAndExponent;
    }

    public static void printLastDigitOfExponentiation(int baseLastDigit, int exponent) {
        if (baseLastDigit == 0 && exponent != 0)
            System.out.println(0);
        else if (baseLastDigit == 0 && exponent == 0)
            System.out.println(1);
        else if (baseLastDigit == 1)
            System.out.println(1);
        else if (baseLastDigit == 2 && exponent % 4 == 0 && exponent != 0)
            System.out.println(6);
        else if (baseLastDigit == 2 && exponent % 4 == 1)
            System.out.println(2);
        else if (baseLastDigit == 2 && exponent % 4 == 2)
            System.out.println(4);
        else if (baseLastDigit == 2 && exponent % 4 == 3)
            System.out.println(8);
        else if (baseLastDigit == 3 && exponent % 4 == 0 && exponent != 0)
            System.out.println(1);
        else if (baseLastDigit == 3 && exponent % 4 == 1)
            System.out.println(3);
        else if (baseLastDigit == 3 && exponent % 4 == 2)
            System.out.println(9);
        else if (baseLastDigit == 3 && exponent % 4 == 3)
            System.out.println(7);
        else if (baseLastDigit == 4 && exponent % 2 == 0 && exponent != 0)
            System.out.println(6);
        else if (baseLastDigit == 4 && exponent % 2 != 0)
            System.out.println(4);
        else if (baseLastDigit == 5 && exponent != 0)
            System.out.println(5);
        else if (baseLastDigit == 6 && exponent != 0)
            System.out.println(6);
        else if (baseLastDigit == 7 && exponent % 4 == 0 && exponent != 0)
            System.out.println(1);
        else if (baseLastDigit == 7 && exponent % 4 == 1)
            System.out.println(7);
        else if (baseLastDigit == 7 && exponent % 4 == 2)
            System.out.println(9);
        else if (baseLastDigit == 7 && exponent % 4 == 3)
            System.out.println(3);
        else if (baseLastDigit == 8 && exponent % 4 == 0 && exponent != 0)
            System.out.println(6);
        else if (baseLastDigit == 8 && exponent % 4 == 1)
            System.out.println(8);
        else if (baseLastDigit == 8 && exponent % 4 == 2)
            System.out.println(4);
        else if (baseLastDigit == 8 && exponent % 4 == 3)
            System.out.println(6);
        else if (baseLastDigit == 9 && exponent % 2 == 0 && exponent != 0)
            System.out.println(1);
        else if (baseLastDigit == 9 && exponent % 2 == 1)
            System.out.println(9);
        else if (baseLastDigit != 0 && exponent == 0)
            System.out.println(1);
    }
}