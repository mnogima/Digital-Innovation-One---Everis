package one.digitalinnovation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Peugeot"));

        System.out.println(listCarros);
        System.out.println(listCarros.contains(new Carro("Ford")));
        System.out.println(listCarros.get(3));
        System.out.println(listCarros.indexOf(new Carro("Chevrolet")));
        //System.out.println(listCarros.remove(2));
        System.out.println(listCarros.remove(new Carro("Peugeot")));
        System.out.println(listCarros);


    }

}
