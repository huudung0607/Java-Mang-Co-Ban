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
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0; i < n ;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n ; i ++){
            int suml = 0, sumr = 0;
            for(int l = 0;l < i ;l++){
                suml += a[l];
            }
            for(int r = i + 1;r < n; r++){
                sumr += a[r];
            }
            if(check(sumr) && check(suml)){
                System.out.print(i + " ");
            }
        }
    }
}
