import java.util.*;
public class leftrotate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        arr=rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] rotate(int[] arr, int k){
        int l = arr.length;
        k=k%l;
        List<Integer> list = new ArrayList<>();
        for(int i=l-k; i<l; i++){
            list.add(arr[i]);
        }
        for(int i=0; i<l-k; i++){
            list.add(arr[i]);
        }
        for(int i=0; i<l ; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}