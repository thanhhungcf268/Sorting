package IIIegal;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a + b <= c || b + c <= a || c + a <= b || a <= 0 || b <= 0 | c <= 0) {
                throw new IllegalTriangleException();
            }
        }catch (IllegalTriangleException ignored){
            System.err.println("tam giác sai ");
        }
        System.out.println("aaa");
    }
}

