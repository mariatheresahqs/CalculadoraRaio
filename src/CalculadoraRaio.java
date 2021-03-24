package src;

import java.util.Locale;
import java.util.Scanner;

import util.*;

public class CalculadoraRaio{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Raio raio = new Raio();

        System.out.print("Digite o valor do raio: ");
        raio.raio = sc.nextDouble();

        System.out.print(raio.toSting());
        
        sc.close();
    }
}