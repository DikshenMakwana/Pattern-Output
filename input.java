import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        String input;
        printinput printobject = new printinput(); //Print input object
        Scanner sc = new Scanner(System.in);       //Scanner object
        System.out.print("Enter the String : ");
        input = sc.nextLine();
        sc.close();
        printobject.printString(input);
    }
}
