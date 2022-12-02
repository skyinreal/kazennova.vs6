package number2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = 0;
        for (Store b : Store.values()) {
            if (a >= b.getCost()) {
                n++;
            }
        }
        Store[] cars = new Store[n];
        n = 0;
        for (Store b : Store.values()) {
            if (a >= b.getCost()) {
                cars[n] = b;
                n++;
            }
        }

        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = cars.length - 1; j > i; j--) {
                if (cars[j - 1].getSpeed() > cars[j].getSpeed()) {
                    Store tmp = cars[j - 1];
                    cars[j - 1] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
        for (Store car : cars) {
            System.out.println(car);
        }
    }
}
