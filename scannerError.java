import java.util.Scanner;


class scannerError{

    public static void main(String[] args) {

        int num1=0;

        int num2=0;

        try (Scanner inputScanner = new Scanner(System.in)) {

            num1 = inputScanner.nextInt();

        }

        try (Scanner inputScanner = new Scanner(System.in)) {

            num2 = inputScanner.nextInt();

        }

        System.out.println(num1 + num2);

    }

}



