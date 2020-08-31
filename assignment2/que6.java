import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter +ve number");
        String n = obj.nextLine();
        int flag=0;
        do {
            flag=0;
            for (int i = 0; i < n.length(); i++)
                if (n.charAt(i) < '0' || n.charAt(i) > '9') {
                    flag = 1;
                    break;
                }
            if (flag == 1) {
                System.out.println("Better chose a positive number. Try again");
                n = obj.nextLine();
            }
        }
        while(flag!=0);
        long a = Long.valueOf(n);
        if(a > Integer.MAX_VALUE) {
            System.out.println(a + " is beyond integer limits." + " Program entered into self destruct mode.");
        }
        else if(a==0)
            System.out.println(0);
        else {

            while (a < 0) {
                System.out.println("Negative numbers are so not allowed. Chose a positive number. Try again");
                a = obj.nextInt();
            }
            if (a == 1)
                System.out.println(a);
            while (a != 1) {
                if (a > Integer.MAX_VALUE) {
                    System.out.println(a + " is beyond integer limits." + " Program entered into self destruct mode.");
                    break;
                }
                if (a % 2 == 0)
                    a /= 2;
                else {
                    if (a * 3 + 1 > Integer.MAX_VALUE) {
                        System.out.println(a + "*3+1 is beyond integer limits." + " Program entered into self destruct mode.");
                        break;
                    } else
                        a = nk * 3 + 1;
                }
                System.out.println(a);
            }
        }
    }
