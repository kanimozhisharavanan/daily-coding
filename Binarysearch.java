import java.util.*;
public class Binarysearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length-1;
        int found =0;
        while(l<r){
            int mid = (l+r)/2;
            if(target == arr[mid]){
                found = 1;
                System.out.print("Target found");
                return;
            }

            else if(target>arr[mid]){
                l=mid+1;
            }
            else{
                r = mid-1;
            }
        }
        if(found == 0){
            System.out.print("Target not found");
        }
        
    }
}