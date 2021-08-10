package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Fiat"));
        listaCarros.add(new Carro("Volkwagen"));
        listaCarros.add(new Carro("Toyota"));


        System.out.println(listaCarros.contains(new Carro("Honda")));
        System.out.println(new Carro("Ford").hashCode());

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Fiat");

        System.out.println(carro1.equals(carro2));

        Carro carro3 = new Carro("Fiat");

        System.out.println(carro2.equals(carro3));

        System.out.println(carro2.hashCode());

        System.out.println(carro3.hashCode());






    }

}
