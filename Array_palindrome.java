import java.util.Scanner;
public class Array_palindrome{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        boolean t=true;
        for(int i=0;i<n;i++){
            if(a[i]!=a[n-i-1]){
                t=false;
                break;
            }
        }
        if(t)
        System.out.print("Palindrome Array");
        else
        System.out.print("Not Plaindrome Array");
    }
}