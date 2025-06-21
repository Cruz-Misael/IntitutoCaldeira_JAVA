public class Main{
    public static void main(String[] args) {
        Livro l = new Livro();
        l.titulo = "Java para iniciantes";
        System.out.println(l.status());
        l.emprestar();
        System.out.println(l.status());
    }
}