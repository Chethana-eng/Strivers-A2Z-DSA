import java.util.*;
public class leaders {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            boolean flag=true;
            for(int j=i+1; j<n-1; j++){
                if(arr[j]>arr[i]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                ans.add(arr[i]);
            }
        }
        System.out.println(ans.toString());
    }
}
