class NPRIMENUMBER {
    public static void main(String[] args) {
        int n = 10; 
        int num = 2;
        int countPrime = 0;

        while (countPrime < n) {
            int count = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(num);
                countPrime++;
            }

            num++;
        }
    }
}