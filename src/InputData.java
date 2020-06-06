import java.util.Scanner;

public class InputData {

    public static String readStringArgument(String userText) {
        System.out.println(userText);
        Scanner userInput = new Scanner(System.in);
        String argument =  userInput.nextLine();
        userInput.close();
        return argument;
    }

}
