import java.util.*;
public class longestconssequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int cnt=0;
        int maxcnt=0;
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
            if(arr[i]+1==arr[i+1]){
                cnt++;
            }
            else{
                cnt=0;
            }
            maxcnt=Math.max(maxcnt, cnt);
        }
        System.out.println(maxcnt);
    }
}
