package number1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a){
            case 1:
                System.out.println(Month.JANUARY.getName());
                break;
            case 2:
                System.out.println(Month.FEBRUARY.getName());
                break;
            case 3:
                System.out.println(Month.MARCH.getName());
                break;
            case 4:
                System.out.println(Month.APRIL.getName());
                break;
            case 5:
                System.out.println(Month.MAY.getName());
                break;
            case 6:
                System.out.println(Month.JUNE.getName());
                break;
            case 7:
                System.out.println(Month.JULY.getName());
                break;
            case 8:
                System.out.println(Month.AUGUST.getName());
                break;
            case 9:
                System.out.println(Month.SEPTEMBER.getName());
                break;
            case 10:
                System.out.println(Month.OCTOBER.getName());
                break;
            case 11:
                System.out.println(Month.NOVEMBER.getName());
                break;
            case 12:
                System.out.println(Month.DECEMBER.getName());
                break;
            default:
                System.out.println("не правильна");
        }


    }
}