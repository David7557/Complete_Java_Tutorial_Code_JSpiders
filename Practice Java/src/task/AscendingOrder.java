package task;
import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers: ");
       System.out.println("----------------------");
        int d1 = sc.nextInt();
        int d2 =sc.nextInt();
        int d3 =sc.nextInt();
        
        sc.close();
        
        int small = (d1 < d2 && d1 < d3)?d1:(d2<d3)?d2:d3;
        int mid = (d1+ d2 + d3)/ 3;
        int big = (d1 > d2 && d1 > d3)?d1:(d2>d3)?d2:d3;

        System.out.println(small+" "+mid+" "+big);
    }
}
