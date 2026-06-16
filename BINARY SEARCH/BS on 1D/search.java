import java.util.*;
public class search{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int k=sc.nextInt();
        int l=0;
        int r=n-1;
        while(l<=r){
            int mid =(r+l)/2;
            if(arr[mid]==k) {
                System.out.println(mid);
                return;
            }
            else if (arr[mid]<k){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
    }
}