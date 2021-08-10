package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaListaDupEncadeada = new ListaDuplamenteEncadeada<>();

        minhaListaDupEncadeada.add("A");
        minhaListaDupEncadeada.add("B");
        minhaListaDupEncadeada.add("C");
        minhaListaDupEncadeada.add("D");
        minhaListaDupEncadeada.add("E");
        minhaListaDupEncadeada.add("F");
        minhaListaDupEncadeada.add("G");

        System.out.println(minhaListaDupEncadeada);

        System.out.println(minhaListaDupEncadeada.get(6));

        minhaListaDupEncadeada.remove(3);
        System.out.println(minhaListaDupEncadeada);

        minhaListaDupEncadeada.add(3,"X");
        System.out.println(minhaListaDupEncadeada);

        System.out.println(minhaListaDupEncadeada.get(3));

    }
}
