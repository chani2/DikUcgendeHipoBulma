import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Degiskenler olustur     a^2+b^2=c^2
        int a, b;

        Scanner inp = new Scanner(System.in);
        System.out.print("A kenari:");
        a = inp.nextInt();
        System.out.print("B kenari:");
        b = inp.nextInt();
        double c = Math.sqrt((a*a)+(b*b));
        System.out.print("C kenari:"+ c);







    }
}
