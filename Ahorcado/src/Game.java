import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the game!");
        // clase Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // variables
        String secretWordString = "hello";
        int attemptsMax = 10;
        int attempts = 0;
        boolean isGameOver = false;

        // Array de caracteres para la palabra secreta 
        char[] charSecretWord = new char[secretWordString.length()];
        
        for (int i = 0; i < charSecretWord.length; i++) {
            charSecretWord[i] = '_';
            System.out.print(charSecretWord[i]);
        }
    }
}
