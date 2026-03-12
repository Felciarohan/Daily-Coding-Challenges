import java.util.Scanner;
public class prime_number {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean pal=false;
        for(int i=2;i<n;i++){
            if(n%i==0)
            pal=true;
        }
        if(pal)
        System.out.print("Not prime number");
        else 
        System.out.print("Prime number");
    }
}
