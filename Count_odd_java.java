import java.util.Scanner;
public class Count_odd_java{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int even=0,odd=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0)
            even++;
            else
            odd++;
        }
        System.out.print(even+" "+odd);
    }
}