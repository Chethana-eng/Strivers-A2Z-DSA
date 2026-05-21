import java.util.*;
public class stockbuysell {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        for(int price:arr){
            if(price<minPrice){
                minPrice = price;
            }
            if(price-minPrice > maxPrice){
                maxPrice = price-minPrice;
            }
        }
        System.out.println(maxPrice);
    }
}
