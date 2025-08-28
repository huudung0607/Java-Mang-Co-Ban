import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        long sum = 0, tich =  1;
        for(int i = 0; i < n ;i++){
            a[i] = sc.nextInt();
            sum += 1l * a[i];
            sum %= mod;
            tich *= 1l * a[i];
            tich %= mod;
        }
        System.out.print(sum + "\n" + tich);
    }
}
