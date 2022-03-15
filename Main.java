import java.util.Scanner;
import static java.lang.Math.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float liczba1,liczba2;
    double p1,p2,suma;
    System.out.println("Podaj pierwsza liczbe");
    liczba1 = sc.nextFloat();
    System.out.println("Podaj druga liczbe");
    liczba2 = sc.nextFloat();
    sc.close();
    p1 = sqrt (liczba1);
    p2 = sqrt (liczba2);
    suma = p1 + p2;
    System.out.println(suma);
    
    
  }
}