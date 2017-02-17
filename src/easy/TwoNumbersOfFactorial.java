package easy;

import java.util.Scanner;

/**
 * Program wypisujacy liczbe dziesiatek i jednosci silni wpisanej liczby n
 *
 * @param number - liczba pobrana od uzytkownika. Od niej obliczamy silnie (liczonej tylko dla zakresu 2..10, dla reszty wypisujacej gotowe wyniki),
 *               a nastepnie wyswietlamy liczbe dziesiatek i jednosci wyniku
 * @author m.losK
 * @version 3.0
 */

public class TwoNumbersOfFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = getNumberFromUser(in);
        for (int i = 0; i < numberOfTests; i++) {
            int number = getNumberFromUser(in);
            printTwoNumbersOfFactorial(number);
        }
        in.close();
    }

    public static int getNumberFromUser(Scanner in) {
        return in.nextInt();
    }

    public static int factorialOfDigitsRecursion(int number) {
        if (number == 0) return 1;
        else return number * factorialOfDigitsRecursion(number - 1);
    }

    public static void printTwoNumbersOfFactorial(int number) {
        if (number <= 1) System.out.printf("%d %d\n", 0, 1);
        else if (number >= 10) System.out.printf("%d %d\n", 0, 0);
        else {
            int digit = factorialOfDigitsRecursion(number);
            System.out.printf("%d %d\n", (digit % 100) / 10, digit % 10);
        }
    }
}