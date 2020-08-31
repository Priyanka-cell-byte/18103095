import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        String string A1 =obj.nextLine();
        String string A2 =obj.nextLine();
        int J=0;
        int flag=0;
        while(J<stringA1.length() && J<stringA2.length())
        {
            if(stringA1.charAt(J) < stringA2.charAt(J)) {
                System.out.println(stringA1 + " is smaller than " + stringA2 + " lexicographically");
                flag=1;
                break;
            }
            else if(stringA1.charAt(J) > stringA2.charAt(J)) {
                System.out.println(stringA2 + " is smaller than " + stringA1 + " lexicographically");
                flag=1;
                break;
            }
            else {
                J++;
            }
        }
        if(flag==0)
        {
            if(J!=stringA1.length() && J==stringA2.length())
                System.out.println(stringA2 + " is lexicographically smaller than " + stringA1);
            else if(J==stringA1.length() && J!=stringA2.length())
                System.out.println(stringA1 + " is lexicographically smaller than " + stringA2);
            else System.out.println(stringA2 + " and " + stringA1 + " are lexicographically equal");
        }
    }
}
