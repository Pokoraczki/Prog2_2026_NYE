import java.util.Scanner;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mp;

        // Bekérés, amíg nem pozitív számot kapunk
        do {
            System.out.print("Hány másodperc telt el? ");
            mp = sc.nextDouble();
        } while (mp < 0);

        // Számítás és kiírás (300 m/s sebességgel)
        System.out.println("A távolság: " + (mp * 300) + " méter.");
    }
