import java.util.Scanner;
public class Binary_palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int b=1,res=0;
        while(n>0){
           int r=n%2;
           res=res+r*b;
           b=b*10;
           n=n/2;
        }
        int temp=res;
        int rev=0;
        while(temp>0){
            int r=temp%10;
            rev=rev*10+r;
            temp=temp/10;
        }
        if(res==rev)
        System.out.print("Palindrome");
        else
        System.out.print("Not Palindrome");
    }
}
