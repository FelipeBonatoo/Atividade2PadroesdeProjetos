package questao1;

import java.util.HashSet;
import java.util.Set;

/** Exibe alerta quando um produto volta a ter estoque após ter zerado. */
public class Vendas implements Observador {

    private final Set<String> produtosZerados = new HashSet<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        if (novaQuantidade == 0) {
            produtosZerados.add(nomeProduto);
        } else if (produtosZerados.remove(nomeProduto)) {
            System.out.println("[VENDAS] ALERTA: \"" + nomeProduto
                    + "\" voltou ao estoque (" + novaQuantidade + " un.)");
        }
    }
}
