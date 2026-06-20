import java.util.*;
public class koko {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int h = sc.nextInt();
        int ans = minspeed(arr, h);
        System.out.println(ans);
    }
    public static int hrs(int[] arr, int speed){
        int hr = 0;
        for(int pile: arr){
            hr += (pile+speed-1)/speed;
        }
        return hr;
    }
    public static int minspeed(int [] arr, int h){
        int low=1;
        int high = 0;
        for(int i=0; i<arr.length; i++){
            high = Math.max(high, arr[i]);
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            if(hrs(arr, mid)<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
