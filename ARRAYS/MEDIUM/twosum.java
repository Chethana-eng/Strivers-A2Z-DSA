import java.util.*;
public class twosum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int sum=0;
        boolean flag=false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int com = target- arr[i];
            if(map.containsKey(com)){
                System.out.println(arr[i] + ", " + com);
                flag=true;
                break;
            }
            map.put(arr[i], i);
        }
        if(!flag){
            System.out.println("{-1,-1}");
        }
    }
}
