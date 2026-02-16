import java.util.Scanner;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kor;

        do {
            System.out.print("Életkor (1-20): ");
            kor = sc.nextInt();
        } while (kor < 1 || kor > 20);

        // A három szint kirajzolása
        rajzol(kor, "* ");
        rajzol(kor, "| ");
        rajzol(kor, "--");
    }

    // Segédfüggvény a rövidítéshez
    static void rajzol(int n, String jel) {
        for (int i = 0; i < n; i++) System.out.print(jel);
        System.out.println();
    }
