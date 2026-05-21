import java.util.*;
public class largestsum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int maxsum=0;
        int sum=0;
        for(int i=0; i<n; i++){
            sum += arr[i];
            maxsum = Math.max(maxsum, sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(maxsum);
    }
}
