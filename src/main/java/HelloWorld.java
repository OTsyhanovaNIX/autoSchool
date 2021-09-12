import java.util.Scanner;

public class HelloWorld {
        public static void main(String [] args){
            System.out.println("Hello world!");
            printHelloName();
        }

        public static void printHelloName(){
            Scanner name = new Scanner(System.in);
            System.out.println("Enter your name");
            String string = name.nextLine();
            System.out.println("Hello, "+string);

        }
}
