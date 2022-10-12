package podstawy;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj numer buta: ");
        int numerButa;
        numerButa = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("Podaj swoją średnią: ");
        double srednia = klawiatura.nextDouble();
        klawiatura.nextLine();


        System.out.println("Podaj imię: ");
        String name = klawiatura.nextLine();

        System.out.println("Twój numer buta: " + numerButa + ", twoja średnia: " +
                srednia + ", nazwywasz się: " + name);




    }
}
