import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0;i < n ;i++){
            a[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i =0;i < n;i++){
            for(int j = i + 1; j < n;j++){
                if(Math.abs(a[i] - a[j]) < min){
                    min = Math.abs(a[i] - a[j]);
                }
            }
        }
        System.out.print(min);
    }
}
