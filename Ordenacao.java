
import java.util.ArrayList;

public class Ordenacao{
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        tarefas.add("Estudar java");
        tarefas.add("Fazer exercícios");
        tarefas.add("Revisar código");

        for (String tarefa : tarefas) {
            if (tarefa.contains("Java")) { 
            System.out.println("Tarefa de programação: " + tarefa); // o "Java" precisa estar minúsculo...
            }
        }

    }
}