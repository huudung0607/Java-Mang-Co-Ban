import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;int cnt2 = 0;
        int []a = new int[n];
        for(int i = 0;i < n ;i++){
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int count_min = 0;
        int count_max = 0;
        for (int i = 0; i < n; i++)
        {
            if (a[i] > x)
            {
                count_max++;
            }
            else if (a[i] < x)
            {
                count_min++;
            }
        }
        System.out.println(count_min);
        System.out.println(count_max);
    }
}
