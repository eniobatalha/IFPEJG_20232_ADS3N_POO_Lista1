public class Util {
    /**
     * Método que retorna a soma de dois valores inteiros
     * @param x
     * @param y
     * @return x + y
     */
    public static int somar(int x, int y) {
        return x + y;
    }

    /**
     * Método que retorna o valor absoluto da soma de dois valores inteiros.
     * @param x
     * @param y
     * @return Math.abs(x + y)
     */
    public static int somarPositivo(int x, int y) {
        int somaPositiva = somar(x,y);
        somaPositiva = Math.abs(somaPositiva);
        return somaPositiva;
    }

    /**
     * Método que retorna o valor da subtração de dois valores inteiros.
     * @param x
     * @param y
     * @return x - y
     */
    public static double subtrair(double x, double y) {
        return x - y;
    }

    /**
     * Método que retorna o valor absoluto da subtração de dois valores inteiros.
     * @param x
     * @param y
     * @return Math.abs(x - y)
     */
    public static double subtrairPositivo(double x, double y) {
        double subtracaoPositiva = subtrair(x,y);
        subtracaoPositiva = Math.abs(subtracaoPositiva);
        return subtracaoPositiva;
    }

    /**
     * Método que retorna o o resto da divisão do primeiro valor inteiro pelo segundo inteiro.
     * @param x
     * @param y
     * @return x % y
     */
    public static int obterResto(int x, int y) {
        return x % y;
    }

    /**
     * Método que ajusta o valor da nota caso seja menor que 0 ou maior que 10
     * @param 'x'
     * @return 0 if x < 0
     * @return 10 if x > 10
     * @return x else
     */
    public static double ajustarNota(double nota) {
        return nota < 0 ? 0 : (nota > 10 ? 10 : nota);
    }

    /**
     * Método que retorna a média aritmética de 3 notas
     * @param x, y, z
     * @return (x + y + z) / 3
     */
    public static double calcularMedia(double x, double y, double z) {
        double xAj = ajustarNota(x);
        double yAj = ajustarNota(y);
        double zAj = ajustarNota(z);
        return (xAj + yAj + zAj) / 3;
    }

    /**
     * Método que verifica status de aprovação do aluno e acordo com a nota.
     * @param x,y,z
     * @return 'APROVADO' if ((x + y + z) / 3) >= 7.0
     * @return 'EXAME FINAL' if ((x + y + z) / 3) >= 2.0
     * @return 'REPROVADO' else
     */
    public static String verificarAprovacao(double x, double y, double z) {
        double media = calcularMedia(x,y,z);
        String resultado = (media >= 7.0) ? "APROVADO" : (media >= 2.0) ? "EXAME FINAL" : "REPROVADO";
        return resultado;
    }

    /**
     * Método que verifica status de aprovação do aluno e acordo com a nota e frequência.
     * @param 'x,y,z freq'
     * @return 'REPROVADO POR FALTA' if freq < 0.75
     * @return 'APROVADO' if (freq > 0.75) && ((x + y + z) / 3) >= 7.0
     * @return 'EXAME FINAL' if (freq > 0.75) && ((x + y + z) / 3) >= 2.0
     * @return 'REPROVADO' else
     */
    public static String verificarAprovacaoCompleta(double nota1, double nota2, double nota3, double freq) {
        if (freq < 0.75) {
            return "REPROVADO POR FALTA";
        } else {
            return verificarAprovacao(nota1, nota2, nota3);
        }
    }
}
