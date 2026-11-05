package questao2;

/** Perfil Rotativo: valor por hora iniciada. */
public class CobrancaRotativa implements EstrategiaCobranca {

    private static final double VALOR_HORA = 8.00;

    @Override
    public double calcular(int minutosPermanencia) {
        return Horas.iniciadas(minutosPermanencia) * VALOR_HORA;
    }

    @Override
    public String getNome() {
        return "Rotativo";
    }
}
