import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>(n);
        int cnt = 0;
        int minval = 10000000;
        for(int i = 0;i < n ;i++){
            int x = sc.nextInt();
            minval = Math.min(minval,x);
            a.add(x);
        }
        for(int x : a){
            if(x == minval){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
