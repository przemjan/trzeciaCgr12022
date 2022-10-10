public class Zmienne {
    public static void main(String[] args) {

        int liczba1;

        liczba1 = 13;

        double liczba2 = 24.9;
        int liczba3 =15;

        System.out.println("Moja śęć liczba 3 " + liczba3);

        liczba1 = (int)liczba2;

        System.out.println(liczba1);


        int workHoursPerYear;
        int hours = 8;
        int days = 5;
        int weeks = 52;

        workHoursPerYear = hours * days * weeks;

        System.out.println("Mój dzisiejszy wynik " +
                workHoursPerYear + " Jakiś następny napis");


        String napis = "Jakiś \nkrótki \"napis\"";

        System.out.println(napis + " to jest\t mój napis");
        System.out.print(napis + " to jest mój napis\n");
        System.out.print(napis + " to jest\n mój napis");

        char znak = '#';

        boolean slonce = false; //true

        //https://github.com/przemjan/trzeciaCgr12022


    }
}
