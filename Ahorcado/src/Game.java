import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the game!");
        // Clase Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Variables
        String secretWordString = "hello";
        int attemptsMax = 10;
        int attempts = 0;
        boolean isGameOver = false;

        // Array de caracteres para la palabra secreta 
        char[] charSecretWord = new char[secretWordString.length()];
        
        // Estructura de control iterativa para mostrar la palabra secreta en lineas (Bucle)
        for (int i = 0; i < charSecretWord.length; i++) {
            charSecretWord[i] = '_';
        }

        // Estructura de control iterativa para preguntar al usuario por una letra (Bucle)
        while (attempts < attemptsMax && !isGameOver) {
            System.out.println("Palabra a Adivinar: " + String.valueOf(charSecretWord));
            System.out.println("Introduce una letra por favor: ");
            // Leer la letra ingresada por el usuario y si ingresa más de una letra solo se toma la primera
            char letter = scanner.next().charAt(0);

            // Estructura de control iterativa para comparar la letra ingresada con la palabra secreta (Bucle)
            boolean isLetterInWord = false;
            for (int i = 0; i < secretWordString.length(); i++) {
                // Estructura de control condicional para verificar si la letra ingresada esta en la palabra secreta
                if (secretWordString.charAt(i) == letter) {
                    charSecretWord[i] = letter;
                    isLetterInWord = true;
                }
            }
            
        }
    }
}
