import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        LinkedHashSet<Integer> se = new LinkedHashSet<>();
        for(int i = 0;i < n ;i++){
            a[i] = sc.nextInt();
            se.add(a[i]);
        }
        for(int i : se){
            System.out.print(i + " ");
        }
    }
}
