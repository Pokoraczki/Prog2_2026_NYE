import java.util.Scanner;


public static void main(String[] args) {
    // Scanner objektum létrehozása a beolvasáshoz
    Scanner scanner = new Scanner(System.in);

    System.out.print("Add meg az aktuális hőmérsékletet: ");

    // Beolvassuk a számot
    int fok = scanner.nextInt();

    // Feltételek ellenőrzése a feladat alapján
    if (fok < 0) {
        System.out.println("Fagypont alatti");
    }
    else if (fok >= 0 && fok < 30) {
        System.out.println("Átlagos");
    }
    else {
        System.out.println("Túl meleg");
    }

    // Lezárjuk a scannert
    scanner.close();
}