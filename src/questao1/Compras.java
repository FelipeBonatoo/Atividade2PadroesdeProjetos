package questao1;

/** Exibe alerta quando o estoque de um produto fica abaixo do limite. */
public class Compras implements Observador {

    private static final int LIMITE_ESTOQUE_BAIXO = 5;

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        if (novaQuantidade < LIMITE_ESTOQUE_BAIXO) {
            System.out.println("[COMPRAS] ALERTA: estoque baixo de \"" + nomeProduto
                    + "\" (" + novaQuantidade + " un.)");
        }
    }
}
