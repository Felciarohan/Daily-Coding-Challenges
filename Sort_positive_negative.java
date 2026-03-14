import java.util.Scanner;
public class Sort_positive_negative {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int l=0,k=n-1;
        for(int i=0;i<n;i++){
        while(l<k){
            if(a[l]<0)
            l++;
            if(a[k]>0)
            k--;
            else{
                swap(a,l,k);
            }
        }
    }
    for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
    }
    }
    private static void swap(int a[],int n,int m){
         int temp=a[n];
         a[n]=a[m];
         a[m]=temp;
    } 
}
