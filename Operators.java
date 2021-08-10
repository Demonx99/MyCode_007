import java.util.Scanner;

public class Operators {
    // Scanner Q=new Scanner(System.in);
    public static void De() {
        Scanner Q = new Scanner(System.in);

        int a = Q.nextInt();
        System.out.println("The value of A is: " + a);
        int b = Q.nextInt();
        System.out.println("The value of B is: " + b);
        int C2 = a * b;
        System.out.println("Your Answer is :" + C2);
        Q.close();

    }

    public static void De2() {
        Scanner Q1 = new Scanner(System.in);
        Double A = Q1.nextDouble();
        System.out.println("The value of A is: " + A);
        Double B = Q1.nextDouble();
        System.out.println("The value of B is: " + B);
        Double C0 = A / B;
        System.out.println("Your Answer is :" + C0);
        Q1.close();

    }

    public static void De3() {
        Scanner P = new Scanner(System.in);
        Double A1 = P.nextDouble();
        System.out.println("The value of A1 is:" + A1);
        Double B1 = P.nextDouble();
        System.out.println("The value of B1 is: " + B1);
        Double C = A1 - B1;
        System.out.println("Your Answer is :" + C);
        P.close();
    }

    public static void De4() {
        Scanner O = new Scanner(System.in);
        Double K = O.nextDouble();
        System.out.println("The value of K is:" + K);
        Double W = O.nextDouble();
        System.out.println("The value of W is:" + W);
        Double S = K + W;
        System.out.println("Your Answer is :" + S);
        O.close();
    }

    public static void main(String args[]) {
        System.out.println("Chose 1 for Multiplication,2 for Divide,3 for  Subtraction,4 for Addition");
        Scanner Q33 = new Scanner(System.in);

        /// System.out.println("Chose 1 for Multiplication,2 for Divide,3 for
        /// Subtraction,4 for Addition");
        int Chose = Q33.nextInt();
        switch (Chose) {
            case 1:
                System.out.println("Multiplication");
                De();
                break;
            case 2:
                System.out.println("Divide");
                De2();
                break;
            case 3:
                System.out.println("subtraction");
                De3();
                break;
            case 4:
                System.out.println("Addition");
                De4();
            default:

                System.out.println("Sorry You have Clicked a wrong number ");

                Q33.close();

        }

    }

}