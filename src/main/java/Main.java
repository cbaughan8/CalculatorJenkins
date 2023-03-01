import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while(!quit) {
            System.out.print("Input: ");
            String input = scanner.nextLine();
            String[] commands = input.split(" ");
            boolean isBinary = false;
            int output = -999999999;

            switch(commands[0]) {
                case("binary"):
                    String binary = calculator.intToBinaryNumber(Integer.parseInt(commands[1]));
                    System.out.println("Output: " + binary);
                    isBinary = true;
                    break;
                case("add"):
                    output = calculator.add(Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
                    break;
                case("subtract"):
                    output = calculator.subtract(Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
                    break;
                case("multiply"):
                    output = calculator.multiply(Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
                    break;
                case("divide"):
                    output = calculator.divide(Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
                    break;
                case("fibonacci"):
                    output = calculator.fibonacciNumberFinder(Integer.parseInt(commands[1]));
                    break;
                case("quit"):
                    quit = true;
                    break;
            }
            if (!isBinary) {
                System.out.println("Output: " + output);
            }
        }

    }
}
