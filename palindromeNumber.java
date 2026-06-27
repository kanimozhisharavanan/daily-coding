import java.util.*;
class palindromeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while(temp>0){
            int rem = temp%10;
            rev = rev*10+rem;
            temp/=10;
        }
        if(rev == n){
            System.out.print("palindrome");
        }
        else{
            System.out.print("Not a Palindrome");
        }
    }
}