package questao2;

/** Perfil Mensalista: valor fixo, independente do tempo de permanência. */
public class CobrancaMensalista implements EstrategiaCobranca {

    private static final double VALOR_FIXO = 250.00;

    @Override
    public double calcular(int minutosPermanencia) {
        return VALOR_FIXO;
    }

    @Override
    public String getNome() {
        return "Mensalista";
    }
}
