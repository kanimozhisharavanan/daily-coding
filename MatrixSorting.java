import java.util.*;

public class MatrixSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c - 1; j++) {
                for (int k = 0; k < c - j - 1; k++) {
                    if (a[i][k] > a[i][k + 1]) {
                        int temp = a[i][k];
                        a[i][k] = a[i][k + 1];
                        a[i][k + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Row-wise sorted:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r - 1; i++) {
                for (int k = 0; k < r - i - 1; k++) {
                    if (a[k][j] > a[k + 1][j]) {
                        int temp = a[k][j];
                        a[k][j] = a[k + 1][j];
                        a[k + 1][j] = temp;
                    }
                }
            }
        }

        System.out.println("Column-wise sorted:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}