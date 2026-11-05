package questao2;

/**
 * Perfil Conveniado: primeiros 30 minutos gratuitos; depois, valor por hora
 * iniciada (contada a partir do fim da gratuidade) com desconto percentual.
 */
public class CobrancaConveniado implements EstrategiaCobranca {

    private static final int MINUTOS_GRATUITOS = 30;
    private static final double VALOR_HORA = 8.00;
    private static final double DESCONTO_PERCENTUAL = 0.25; // 25%

    @Override
    public double calcular(int minutosPermanencia) {
        int minutosCobrados = minutosPermanencia - MINUTOS_GRATUITOS;
        if (minutosCobrados <= 0) {
            return 0.0;
        }
        double valorCheio = Horas.iniciadas(minutosCobrados) * VALOR_HORA;
        return valorCheio * (1 - DESCONTO_PERCENTUAL);
    }

    @Override
    public String getNome() {
        return "Conveniado";
    }
}
