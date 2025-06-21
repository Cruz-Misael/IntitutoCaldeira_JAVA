
import java.time.LocalTime;

public class Prazo{
    public static void main(String[] args) {
        LocalTime envio = LocalTime.of(23, 00);
        LocalTime limite = LocalTime.of(22,59);

        if (!envio.isBefore(limite)) {
            System.out.println("Fora prazo");
        } else {
            System.out.println("Tarefa enviada");
        }

    }
}