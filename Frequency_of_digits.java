import java.util.Scanner;
public class Frequency_of_digits{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[256];
        while(n>0){
            int r=n%10;
            a[r]++;
            n=n/10;
        }
        for(int i=0;i<256;i++){
            if(a[i]>0){
                System.out.println(i+"->"+a[i]);
            }
        }
    }
}