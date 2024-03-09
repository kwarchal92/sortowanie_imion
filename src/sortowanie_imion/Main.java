package sortowanie_imion;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        ArrayList lista = new ArrayList(); //utworzenie obiektu klasy ArrayList();
        lista.add("Julia");
        lista.add("Michał");
        lista.add("Anna");
        lista.add("Magdalena");
        lista.add("Jan");
        lista.add("Zofia");

        System.out.println("Elementy nieposortowane");

        for (int i = 0; i < lista.size(); i++)
        {
            if (i < lista.size()- 1)
                System.out.print(lista.get(i) + ", ");
            else
                System.out.print(lista.get(i) + ". ");
        }

        System.out.println();
        Collections.sort(lista); //sortowanie listy


    }
}
