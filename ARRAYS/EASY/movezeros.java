import java.util.*;
public class movezeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int j=-1;
        //finding the 1st zero
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        //if no zeros found
        if(j==-1) System.out.println(-1);
        for(int i=j+1; i<n; i++){
            if(arr[i]!=0){
                //swap
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
