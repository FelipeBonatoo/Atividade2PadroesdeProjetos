package questao2;

/**
 * Papel de Strategy: cada perfil de cliente é uma implementação desta interface.
 * Criar um novo perfil = criar uma nova classe, sem alterar o código existente (RQ2.8).
 */
public interface EstrategiaCobranca {

    double calcular(int minutosPermanencia);

    String getNome();
}
