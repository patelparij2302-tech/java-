import java.util.Scanner;

class stringpattern {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = s.next();

        int n = str.length();

        for (int i = 1; i <= n; i++) {

            
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            
            for (int j = 0; j < i; j++) {
                System.out.print(str.charAt(j));
            }

            System.out.println();
        }

        s.close();
    }
}