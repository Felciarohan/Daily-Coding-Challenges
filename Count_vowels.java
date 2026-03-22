import java.util.Scanner;
public class Count_vowels {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int vowels=0,cons=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if((c>='A'&&c<='Z')||(c>='a'&&c<='z')){
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'
                ||c=='E'||c=='I'||c=='O'||c=='U')
                vowels++;
                else
                cons++;
            }
        }
            System.out.println("Vowels: "+vowels);
            System.out.print("Consonants: "+cons);
    }
}
