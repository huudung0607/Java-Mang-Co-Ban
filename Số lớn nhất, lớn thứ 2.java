import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static int gcd(int a,int b){
        if(b == 0) return a;
        return gcd(b,a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0; i < n ;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.print(a[n - 1] + " " + a[n - 2]);
    }
}
