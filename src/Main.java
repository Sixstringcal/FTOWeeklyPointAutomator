import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the results for the round as described in README.md");
        String input = scanner.nextLine();
        while(!input.equals("done with results")){
            int roundNumber = Integer.parseInt(input);
        }
    }
}
