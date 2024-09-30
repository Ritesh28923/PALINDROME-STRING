import java.util.Scanner;
class palin{
public static void main(String[] arr) {
String s= new String();
Scanner sc= new Scanner(System.in);
System.out.println("Enter String");
s=sc.nextLine();
int i=0;
j=s.length()-1;
Flag=0;
while(i<j && Flag==0){
    if(s.charAt(i)!=s.charAt(j))
    {
        Flag=1;
    }
    i=i+1;
    j=j-1;
}
if(Flag==0){
    System.out.println("String is Palindrome");
}
else{
    System.out.println("String is not Palindrome");

}
}
}
