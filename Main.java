import java.util.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        guessr();
//        estimationOfPi();
//        stringToPhoneNumberDigits();
//        splitNumbers();


    }

    private static void splitNumbers() {
        System.out.print("Please enter some numbers: ");
        String input = scanner.nextLine();
        String[] split = input.split("\\s+");
        int[] arrayOfInts = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arrayOfInts[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(arrayOfInts);
        for (int elem : arrayOfInts) {
            System.out.print(elem + " ");
        }
    }

    private static void stringToPhoneNumberDigits() {
        String input = scanner.next();
        String charsTo2 = "abc";
        String charsTo3 = "def";
        String charsTo4 = "ghi";
        String charsTo5 = "jkl";
        String charsTo6 = "mno";
        String charsTo7 = "pqrs";
        String charsTo8 = "tuv";
        String charsTo9 = "wxyz";
        String charsTo0 = " ";
        String currentChar;
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < input.length(); i++) {
            currentChar = Character.toString(input.charAt(i)).toLowerCase(Locale.ROOT);
            if (charsTo2.contains(currentChar)) {
                stringBuilder.append("2");
            } else if (charsTo3.contains(currentChar)) {
                stringBuilder.append("3");
            } else if (charsTo4.contains(currentChar)) {
                stringBuilder.append("4");
            } else if (charsTo5.contains(currentChar)) {
                stringBuilder.append("5");
            } else if (charsTo6.contains(currentChar)) {
                stringBuilder.append("6");
            } else if (charsTo7.contains(currentChar)) {
                stringBuilder.append("7");
            } else if (charsTo8.contains(currentChar)) {
                stringBuilder.append("8");
            } else if (charsTo9.contains(currentChar)) {
                stringBuilder.append("9");
            } else if (charsTo0.contains(currentChar)) {
                stringBuilder.append("0");
            }
        }
        System.out.println(stringBuilder.toString());

    }

    private static void estimationOfPi() {
        int numberOfIterations = scanner.nextInt();
        double x;
        double y;
        int pointsInTheArea = 0;
        for (int i = 0; i < numberOfIterations; i++) {
            x = Math.random();
            y = Math.random();
            if (Math.pow(x, 2) + Math.pow(y, 2) <= 1) {
                pointsInTheArea++;
            }
        }
        double pi = 4 * ((double) pointsInTheArea) / numberOfIterations;
        System.out.println(pi);

    }

    private static void guessr() {
        Random random = new Random();
        int minimum = 1;
        int maximum = 100;
        int randomNumber = random.nextInt(maximum - minimum) + minimum;
        int guess;
//        System.out.println(randomNumber);
        do {
            guess = scanner.nextInt();
            if (guess < randomNumber) {
                System.out.println("Too low");
            } else if (guess > randomNumber) {
                System.out.println("Too high");
            } else {
                System.out.println("You've guessed");
            }
        } while (guess != randomNumber);
    }
}
