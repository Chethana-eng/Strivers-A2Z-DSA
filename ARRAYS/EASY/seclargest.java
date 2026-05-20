import java.util.*;
public class seclargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int large= Integer.MIN_VALUE;
        int seclarge=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>large){
                seclarge = large;
                large = arr[i];
            }
            else if( arr[i]>seclarge && arr[i]!=large){
                seclarge = arr[i];
            }
        }
        System.out.println(seclarge);
    }
}
