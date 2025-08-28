import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        int maxNum = -1, minNum = Integer.MAX_VALUE;
        for(int i = 0; i < n ;i++){
            a[i] = sc.nextInt();
            maxNum = Math.max(maxNum,a[i]);
            minNum = Math.min(minNum,a[i]);
        }
        for(int i = n - 1;i >= 0;i--){
            if(a[i] == minNum){
                System.out.print(i);break;
            }
        }
        System.out.print(" ");
        for(int i =0 ;i < n ; i++){
            if(a[i] == maxNum){
                System.out.print(i); break;
            }
        }

    }
}
