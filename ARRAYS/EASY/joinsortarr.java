import java.util.*;
public class joinsortarr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for(int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0; i<m; i++){
            arr2[i]=sc.nextInt();
        }
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                ans.add(arr1[i]);
                i++;
            } else {
                ans.add(arr2[j]);
                j++;
            }
        }
        // remaining elements
        while (i < n) {
            ans.add(arr1[i]);
            i++;
        }
        while (j < m) {
            ans.add(arr2[j]);
            j++;
        }
        System.out.println(ans);
    }
}
