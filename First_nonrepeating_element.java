import java.util.Scanner;
public class First_nonrepeating_element {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int hash[]=new int[256];
        for(int i=0;i<n;i++)
        hash[a[i]]++;
        for(int i=0;i<n;i++){
            if(hash[a[i]]==1){
                System.out.print(a[i]);
                break;
            }
        }
    }
}
