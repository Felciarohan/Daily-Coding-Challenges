import java.util.Scanner;
public class String_palindrome {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int n=str.length();
        char c[]=str.toCharArray();
        boolean t=true;
        for(int i=0;i<str.length();i++){
           if(c[i]!=c[n-i-1]){
               t=false;
               break;
           }
        }
        if(t)
        System.out.print("Palindrome");
        else
        System.out.print("Not Palindrome");
    }
}
