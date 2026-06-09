import java.util.*;

class BothrowColSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] a = new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                a[i][j] = sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c-1;j++){
                for(int k=0;k<c-1-j;k++){
                    if(a[i][k] > a[i][k+1]){
                        int temp = a[i][k];
                        a[i][k] = a[i][k+1];
                        a[i][k+1] = temp;
                    }
                }
            }
        }
        for(int j=0;j<c;j++){
            for(int i=0;i<r-1;i++){
                for(int k=0;k<r-1-i;k++){
                    if(a[k][j] > a[k+1][j]){
                        int temp = a[k][j];
                        a[k][j] = a[k+1][j];
                        a[k+1][j] = temp;
                    }
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}