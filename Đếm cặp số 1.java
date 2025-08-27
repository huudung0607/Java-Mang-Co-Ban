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
        int k = sc.nextInt();
        Map<Integer,Integer> mp = new HashMap<>();
        int cnt = 0;
        for(int i =0;i < n;i++){
            int t = k - a[i];
            if(mp.containsKey(t)){
                cnt += mp.get(t);
            }
            mp.put(a[i],mp.getOrDefault(a[i],0) + 1);
        }
        System.out.print(cnt);
    }
}
