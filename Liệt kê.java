import java.util.*;
import java.lang.*;
public class Main {
    public static boolean Prime(int n){
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i ==0) return false;
        }
        return true;
    }
    public static boolean sumPrime(int n){
        int sum = 0;
        while (n != 0){
            sum += n % 10;
            n /= 10;
        }
        if (Prime(sum)) return true;
        return false;
    }
    public static boolean thuanNghich(int n){
        int sum = 0;
        int temp = n;
        while (n != 0){
            sum = sum * 10 + n % 10;
            n /= 10;
        }
        if (sum == temp) return true;
        return false;
    }
    public static boolean chinhPhuong(int n){
        int tmp = (int)Math.sqrt(n);
        if(tmp * tmp == n) return true;
        return false;
    }
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        for(int i = 0 ;i < n ;i++){
            a[i] = sc.nextInt();
            if(Prime(a[i])) c1++;
            if(thuanNghich(a[i])) c2++;
            if(chinhPhuong(a[i])) c3++;
            if(sumPrime(a[i])) c4++;
        }
        System.out.print(c1 + "\n" + c2 + "\n" + c3 + "\n" + c4);
    }
}
