import java.util.Scanner;

public class Switch{

public static void main(String[] args) {

    try (Scanner in = new Scanner(System.in)) {
        String fruit = in.next();

        switch(fruit) {
            case "Mango":
            System.out.println("King of fruits");
            break;
            case "Apple": 
            System.out.println("A sweet red fruit");
            break;
            case "Orange":
            System.out.println("Winter fruit");
            break;
            default:
            System.out.println("please enter a valid fruit");
        }
    }
    
}
}