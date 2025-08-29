import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0; i < n ;i++){
            a[i] = sc.nextInt();
        }
        if ((a[0] > 0 && a[1] < 0) || (a[0] < 0 && a[1] > 0)) {
            System.out.print(a[0] + " ");
        }
        for(int i = 1;i < n - 1; i++){
            if(a[i] > 0){
                if(a[i + 1] < 0 || a[i - 1] < 0){
                    System.out.print(a[i] + " ");
                }
            }
            else{
                if(a[i + 1] > 0 || a[i - 1] > 0){
                    System.out.print(a[i] + " ");
                }
            }
        }
        if((a[n - 1] > 0 && a[n - 2] < 0) || (a[n - 1] < 0 && a[n - 2] > 0)){
            System.out.print(a[n - 1]);
        }
    }
}
