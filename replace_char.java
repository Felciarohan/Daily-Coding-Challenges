import java.util.Scanner;
public class replace_char {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char a[]=str.toCharArray();
        int n=str.length();
        int j=0;
        for(int i=0;i<n;i++){
            if(i==n-1){
                char c=a[i];
                a[i]=a[j];
                a[j]=c;
            }
        }
        for(int i=0;i<n;i++)
        System.out.print(a[i]);
    }
}
