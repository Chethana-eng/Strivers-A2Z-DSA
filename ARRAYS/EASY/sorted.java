import java.util.*;
public class sorted {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        boolean flag= true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
