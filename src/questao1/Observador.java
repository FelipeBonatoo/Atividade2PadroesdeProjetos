package questao1;

/**
 * Papel de Observer: qualquer área interessada em mudanças de estoque
 * implementa esta interface.
 */
public interface Observador {

    void atualizar(String nomeProduto, int novaQuantidade);
}
