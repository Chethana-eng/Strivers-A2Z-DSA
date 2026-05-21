import java.util.*;
public class numrepeatonce {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(int key: map.keySet()){
            if(map.get(key)==1){
                System.out.print(key);
            }
        }

        
            //using xor
    //    int xor=0;
    //    for(int num: nums){
    //     xor ^= num;
    //    }
    //    return xor;
    }
}
