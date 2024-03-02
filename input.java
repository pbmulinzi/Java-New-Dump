import java.util.Scanner;
public class input {
    public static void main(String[] args){
        Scanner y = new Scanner(System.in);
        // Prompt the user to eneter 2 integers
        System.out.println("Enter an integer:");
        float num1 = y.nextFloat();
        System.out.println("Enter an integer:");
        float num2 = y.nextFloat();
        float average = (num1 + num2)/2;
        System.out.println("The average of "+ num1 + "  and " + num2 + " is " + average);

    }
}
