import java.util.Scanner;

class vowel_and_consonant_count {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = s.nextLine();

        int vowel = 0, consonant = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            
            if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }

        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);

        s.close();
    }
}