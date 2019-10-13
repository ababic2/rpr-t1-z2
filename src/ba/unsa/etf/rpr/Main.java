package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Koliko zelite brojeva?");
        int n;
        n = S.nextInt();
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            if (i % sumaCifara(i, sum) == 0)
                System.out.println(i);
        }
    }

    private static int sumaCifara(int i, int sum) {
        if (i == 0) return sum;
        else {
            sum += i % 10;
            return sumaCifara((i / 10), sum);
        }
    }
}
