import java.util.Scanner;
public class palindrome {
    public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int m=n;
    int rev=0;
    while(n>0){
        int r=n%10;
        rev=rev*10+r;
        n=n/10;
    }
    if(rev==m){
        System.out.print("Palindrome");
    }
    else{
        System.out.print("Not palindrome");
    }
}
}
