public class Sistema {
    public static void main(String[] args) {
        String n = "Carlos";
        double a = 8;
        double b = 7;
        double c = (a + b) / 2;
        System.out.println("O aluno " + n + " tem a média: " + c);
        System.out.println("Média: " + c);

        if (c >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
    }