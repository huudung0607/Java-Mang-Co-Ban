import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>(n);
        int sum = 0;
        int sumc = 0;
        int cnt = 0;
        for(int i = 0; i < n;i++){
            int x = sc.nextInt();
            sum += x;
            if(x % 2 == 0) {
                cnt++;
                sumc += x;
            }
        }
        System.out.println(cnt);
        System.out.println(n - cnt);
        System.out.println(sumc);
        System.out.print(sum - sumc);
    }
}
