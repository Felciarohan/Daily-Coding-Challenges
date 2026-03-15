import java.util.Scanner;
public class Array_equal{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        for(int i=0;i<n;i++)
        b[i]=s.nextInt();
        sort(a,n);
        sort(b,n);
        boolean t=true;
        for(int i=0;i<n;i++){
            if(a[i]!=b[i]){
            t=false;
            break;
            }
        }
        if(t)
        System.out.print("Equal");
        else
        System.out.print("Not equal");
    }

    private static void sort(int[] a, int n) {
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
    }
}