package one.digitalinnovation;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();
        Map<String, String> aluno2 = new HashMap<>();

        aluno.put("Nome","João");
        aluno.put("Idade","17");
        aluno.put("Média","8.5");
        aluno.put("Turma","3a");

        aluno2.put("Nome","Maria");
        aluno2.put("Idade","16");
        aluno2.put("Média","9.5");
        aluno2.put("Turma","3a");

        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String >> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);
        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        listaAlunos.add(aluno2);

        System.out.println(aluno.containsKey("Nome"));
        System.out.println(aluno2.containsValue("Maria"));

    }

}
