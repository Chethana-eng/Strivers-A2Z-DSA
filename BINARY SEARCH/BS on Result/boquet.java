import java.util.*;
public class boquet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i=0; i<l; i++){
            arr[i]= sc.nextInt();
        }
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(minans(arr,m,n));
    }
    public static boolean possible(int[] arr, int m, int n, int day){
        int bouquet=0;
        int cnt=0;
        for(int bloom: arr){
            if(bloom<=day){
                cnt++;
                if(cnt==n){
                    bouquet++;
                    cnt=0;
                }
            }
            else{
                cnt=0;
            }
        }
        return bouquet>=m;
    } 
    public static int minans(int[] arr, int m, int n){
        if((long)m*n > arr.length) return -1;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int ans = -1;
        for(int i=0; i<arr.length; i++){
            low = Math.min(low, arr[i]);
            high = Math.max(high, arr[i]);
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            if(possible(arr,m,n,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
