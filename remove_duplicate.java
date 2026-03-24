import java.util.Scanner;
public class remove_duplicate {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        char c[]=str.toCharArray();
        int n=str.length();
        int a[]=new int[256];
        for(int i=0;i<n;i++)
        a[c[i]]++;
        for(int i=0;i<n;i++){
            if(a[c[i]]>0){
                System.out.print(c[i]);
                a[c[i]]=0;
            }
        }
    }
}
