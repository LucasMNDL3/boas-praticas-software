public class Sistema {

    private static final double MEDIA_APROVACAO = 6.0;

    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double primeiraNota = 8;
        double segundaNota = 7;

        double media = calcularMedia(primeiraNota, segundaNota);
        String situacao = verificarSituacao(media);

        exibirResultado(nomeAluno, media, situacao);
    }

    private static double calcularMedia(double primeiraNota, double segundaNota) {
        return (primeiraNota + segundaNota) / 2;
    }

    private static String verificarSituacao(double media) {
        if (media >= MEDIA_APROVACAO) {
            return "Aprovado";
        }
        return "Reprovado";
    }

    private static void exibirResultado(String nomeAluno, double media, String situacao) {
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Media: " + media);
        System.out.println(situacao);
    }
}