import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        LinkedHashMap<Integer,Integer> mp = new LinkedHashMap<>();
        for(int i = 0; i < n ;i++){
            a[i] = sc.nextInt();
            mp.put(a[i],mp.getOrDefault(a[i],0) + 1);
        }
        for(Map.Entry<Integer,Integer> i : mp.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}
