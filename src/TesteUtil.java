// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TesteUtil {
    public static void main(String[] args) {
        System.out.println(Util.somar(-5, -7));
        System.out.println(Util.somarPositivo(-5, -7));
        System.out.println(Util.subtrair(5, 7));
        System.out.println(Util.subtrairPositivo(5, 7));
        System.out.println(Util.obterResto(3, 2));
        System.out.println(Util.ajustarNota(13));
        System.out.println(Util.calcularMedia(6.83, 7.21, 6.77));
        System.out.println(Util.verificarAprovacao(6.83, 7.21, 7.77));
        System.out.println(Util.verificarAprovacaoCompleta(6.83, 7.21, 6.77, 0.71));
    }
}