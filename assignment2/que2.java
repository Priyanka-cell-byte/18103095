import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size");
        int n = obj.nextInt();
        int[] nums= new int[n];
        System.out.println("Enter the array elements. Acceptable range: 0 to 20 (inclusive)");
        for(int i=0; i<n; i++) {
            nums[i]=obj.nextInt();
            while(nums[i]>20 || nums[i]<0) {
                System.out.println("Invalid input. enter the numbers between 0 and 20 only!");
                nums[i] = obj.nextInt();
            }
        }
        int reff[]= new int [21];
        for(int i=0; i<21; i++)
            reff[i]=0;
        for(int i=0; i<n; i++) {
            reff[nums[i]]++;
        }
        int index=0;
        for(int i=0; i<21; i++) {
            for(int j=0; j<reff[i]; j++) {
                nums[index]=i;
                index++;
            }
        }
        for(int i=0; i<n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}