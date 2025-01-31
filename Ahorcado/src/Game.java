import java.util.Scanner;
import java.util.Random;


public class Game {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the game!");
        // Clase Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Variables
        String[] words = { "hola", "palabra", "java", "programar", "languaje", "computadora", "teclado", "mouse", "monitor", "pantalla" };
        int randomIndex = random.nextInt(words.length);
        String secretWordString = words[randomIndex];
        int attemptsMax = 10;
        int attempts = 0;
        boolean isGame = false;

        // Array de caracteres para la palabra secreta 
        char[] charSecretWord = new char[secretWordString.length()];
        
        // Estructura de control iterativa para mostrar la palabra secreta en lineas (Bucle)
        for (int i = 0; i < charSecretWord.length; i++) {
            charSecretWord[i] = '_';
        }

        // Estructura de control iterativa para preguntar al usuario por una letra (Bucle)
        while (attempts < attemptsMax && !isGame) {
            // El valueOf convierte un array de caracteres a un string ya que no se puede imprimir un array de caracteres y se utiliza el método equals para comparar dos strings, el valueOf se usa cuando tenemos una palabra de chars y queremos convertirla a un string
            System.out.println("Palabra a Adivinar: " + String.valueOf(charSecretWord) + " (" + secretWordString.length() + " letras)");
            System.out.println("Introduce una letra por favor: ");

            // Lee la letra ingresada por el usuario y si ingresa más de una letra solo se toma la primera, ademas convertimos la letra ingresada en minúscula.
            char letter = Character.toLowerCase(scanner.next().charAt(0));

            // Estructura de control iterativa para comparar la letra ingresada con la palabra secreta (Bucle)
            boolean isLetterInWord = false;
            for (int i = 0; i < secretWordString.length(); i++) {
                // Estructura de control condicional para verificar si la letra ingresada esta en la palabra secreta
                if (secretWordString.charAt(i) == letter) {
                    charSecretWord[i] = letter;
                    isLetterInWord = true;
                }
            }

            // Estructura de control condicional para verificar si la palabra secreta fue adivinada
            if (!isLetterInWord) {
                attempts++;
                System.out.println("Fallaste! Te quedan " + (attemptsMax - attempts) + " intentos");
            }

            // Estructura de control condicional en la cual si la palabra es igual a la palabra secreta
            if (String.valueOf(charSecretWord).equals(secretWordString)) {
                System.out.println("¡Felicidades! Adivinaste la palabra secreta: " + secretWordString);
                isGame = true;
            }
        }

        // Estructura de control condicional para verificar si el juego termino
        if (!isGame) {
            System.out.println("GAME OVER!");
            System.out.println("¡Que pena te quedaste sin intentos! La palabra secreta era: " + secretWordString);
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
