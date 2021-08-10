package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {

        //Fila minhaFila = new Fila();

        //minhaFila.enqueue(new No("Primeiro"));
        //minhaFila.enqueue(new No("Segundo"));
        //minhaFila.enqueue(new No("Terceiro"));
        //minhaFila.enqueue(new No("Quarto"));

        //minhaFila.enqueue(1);
        //minhaFila.enqueue("Primeiro");
        //minhaFila.enqueue("Segundo");
        //minhaFila.enqueue("Terceiro");
       // minhaFila.enqueue("Quarto");

        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("Primeiro");
        minhaFila.enqueue("Segundo");
        minhaFila.enqueue("Terceiro");
        minhaFila.enqueue("Quarto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue("Primeiro");

        System.out.println(minhaFila);

        System.out.println("Primeiro elemento: " + minhaFila.first());


    }


}
