package one.digitalinnovation;

public class ExercicioString {

    public static void main(String[] args) {

        System.out.println("A B C D E F G".toCharArray().length);
        System.out.println("ABCDEFG".toCharArray().length);
        //System.out.println("Aula de Java". split(" "));
        System.out.println("Quantidade de partes após o split: " + "Aula de Java". split(" ").length);
        System.out.println("Aula".concat(" de Java"));
        System.out.println("1234 asda qw".replaceAll("[0-9]","#"));
        System.out.println("1234 asda qw".replaceAll("[a-z]","*"));


    }
}
