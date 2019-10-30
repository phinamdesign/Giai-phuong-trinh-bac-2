import java.util.Scanner;

public class QuadraticEquation {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.print("Nhập hệ số bậc 2, a = ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số bậc 1, b = ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hằng số tự do, c = ");
        double c = scanner.nextDouble();
        Account account = new Account(a, b, c);

        if (account.getA() == 0) {
            if (account.getB() == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + account.getOnlyRoot());
            }
            return;
        }

        if (account.getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + account.getRoot1() + " và x2 = " + account.getRoot2());
        } else if (account.getDiscriminant() == 0) {
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + account.getDoubleRoot());
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }

    }
}



