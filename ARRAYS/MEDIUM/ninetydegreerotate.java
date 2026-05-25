import java.util.*;
public class ninetydegreerotate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int [][] matrix = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0;j <n; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        int[][] ans = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0;j <n; j++){
                ans[j][n-i-1]=matrix[i][j];
            }
        }
        for(int[] row: ans){
            for(int i: row){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
