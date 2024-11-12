public class Main {
    public static void main(String[] args) {
        // Тестування Завдання 1
        System.out.println("Завдання 1: Перетворення int у hex рядок");
        try {
            System.out.println(intToHexString(51966)); // очікується "CAFE"
            System.out.println(intToHexString(255));   // очікується "FF"
            System.out.println(intToHexString(-1));    // викликає IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.err.println("Помилка: " + e.getMessage());
        }

        // Тестування Завдання 2
        System.out.println("\nЗавдання 2: Перетворення слів у реченні на великі літери");
        try {
            String sentence = "The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago";
            System.out.println(convertWordsToUpperCase(sentence));
            System.out.println(convertWordsToUpperCase("Hello 123 world123")); // Перевірка з комбінаціями букв і цифр
            System.out.println(convertWordsToUpperCase("1234567890")); // Перевірка з цифрами
            System.out.println(convertWordsToUpperCase(null)); // викликає NullPointerException
        } catch (NullPointerException e) {
            System.err.println("Помилка: Речення не може бути null.");
        }
    }

    // Завдання 1: Перетворення int у шістнадцятковий рядок
    public static String intToHexString(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Число повинно бути невід’ємним.");
        }
        return Integer.toHexString(i).toUpperCase();
    }

    // Завдання 2: Перетворення слів у реченні на великі літери
    public static String convertWordsToUpperCase(String sentence) {
        if (sentence == null) {
            throw new NullPointerException("Речення не може бути null.");
        }
        String[] parts = sentence.split(" ");
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].matches("[a-zA-Z]+")) {
                parts[i] = parts[i].toUpperCase();
            }
        }
        return String.join(" ", parts);
    }
}

