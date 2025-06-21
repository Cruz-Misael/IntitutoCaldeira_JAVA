public class Avaliacao {
    public static void main(String[] args) {
        int peso = 7;
        int nota = 2;

        double media = (nota * peso + 6 * 3 / 5);
        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Revisar conteúdo");
        }
    }
}