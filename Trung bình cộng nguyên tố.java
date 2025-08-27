import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static boolean check(int n){
        if(n < 2) return false;
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 0;i < n ;i++){
            int x = sc.nextInt();
            if(check(x)) {
                cnt++;sum += 1.0 * x;
            }
        }
        System.out.printf("%.3f",sum/cnt);
    }
}
