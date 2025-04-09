import java.util.Scanner;

class Calculator{
    void add(int x, int y){
        System.out.println(x+y);
    }
    void sub(int x, int y){
        System.out.println(x-y);
    }
    void mul(int x, int y){
        System.out.println(x*y);
    }
    void div(int x, int y){
        System.out.println(x/y);
    }
}
public class TakingInput {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second number: ");
        int b = sc.nextInt();

        Calculator c1 = new Calculator();
        c1.add(a, b);
        c1.sub(a, b);
        c1.mul(a, b);
        c1.div(a, b);

        sc.close();
    }
}
