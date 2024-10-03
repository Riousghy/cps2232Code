import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        recursiveStack();
    }
    public static void recursiveStack() {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        if(input.equals("*"))
            System.out.println("-----------");
        else {
            recursiveStack();
        }
        System.out.println(input);
        sc.close();
    }
}