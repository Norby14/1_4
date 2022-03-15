import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Wpisz pierwszą liczbę:");
        Scanner pobierz = new Scanner(System.in);
        int liczba1,liczba2;
        liczba1 = pobierz.nextInt();
				System.out.println("Wpisz drugą liczbę:");
        liczba2 = pobierz.nextInt();
        int ans;
        System.out.println("Wybierz operacje:\n 1 - Pole prostokąta \n 2 - Suma pól kół \n 3 - Pole trójkąta \n 4 - Iloraz");
        int wybierz;
        wybierz = pobierz.nextInt();
        switch (wybierz){
        case 1:
            System.out.println(prostokat( liczba1,liczba2));
            break;
        case 2:
            System.out.println(kolo( liczba1,liczba2));
            break;      
        case 3:
            System.out.println(trojkat( liczba1,liczba2));
            break;
        case 4:
            System.out.println(iloraz( liczba1,liczba2));
            break;
            default:
                System.out.println("Wybierz inne");


        }



    }
    public static int prostokat(int x, int y)
    {
        int wynik = x * y;
        return wynik;
    }
    public static double kolo(double x, double y)
    {
        double wynik = 3.14*x*x + 3.14*y*y ;
        return wynik;
    }
    public static int trojkat(int x, int y)
    {
        int wynik = (x*y)/2;
        return wynik;
    }
    public static int iloraz(int x, int y)
    {
        int wynik = x/y;
        return wynik;
    }

}