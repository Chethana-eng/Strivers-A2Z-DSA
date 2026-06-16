import java.util.*;
public class searchinsertpos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(pos(arr,n,k));
    }
    public static int pos(int[] arr, int n, int k){
        int l=0;
        int r=n-1;
        while(l<=r){
            int mid =(r+l)/2;
            if(arr[mid]==k) return mid;
            else if (arr[mid]<k){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return l;
    }
}
