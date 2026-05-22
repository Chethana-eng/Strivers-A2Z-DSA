import java.util.*;
public class arrangebysign {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        // List<Integer> pos = new ArrayList<>();
        // List<Integer> neg = new ArrayList<>();
        // for(int i=0; i<n;i++){
        //     if(arr[i]>0){
        //         pos.add(arr[i]);
        //     }
        //     else{
        //         neg.add(arr[i]);
        //     }
        // }
        // for(int i=0; i<n/2; i++){
        //     arr[2*i] = pos.get(i);
        //     arr[2*i+1] = neg.get(i);
        // }
        // System.out.println( Arrays.toString(arr) );



        //optimized approach
        int[] ans = new int[n];
        int posidx=0;
        int negidx=1;
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                ans[posidx]= arr[i];
                posidx+=2;
            }
            else{
                ans[negidx]=arr[i];
                negidx+=2;
            }
        }
        System.out.println( Arrays.toString(ans) );
    }
}
