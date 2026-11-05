package questao1;

import java.util.ArrayList;
import java.util.List;

/**
 * Papel de Subject: mantém nome, quantidade e a lista de observadores.
 * Não conhece nenhuma área concreta (RQ1.7).
 */
public class Produto {

    private final String nome;
    private int quantidade;
    private final List<Observador> observadores = new ArrayList<>();

    public Produto(String nome, int quantidadeInicial) {
        this.nome = nome;
        this.quantidade = quantidadeInicial;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarObservador(Observador observador) {
        if (!observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void setQuantidade(int novaQuantidade) {
        if (novaQuantidade == this.quantidade) {
            return; // RQ1.4: só comunica quando a quantidade realmente muda
        }
        this.quantidade = novaQuantidade;
        notificarObservadores();
    }

    private void notificarObservadores() {
        // cópia defensiva: permite que um observador se remova durante a notificação
        for (Observador observador : new ArrayList<>(observadores)) {
            observador.atualizar(nome, quantidade);
        }
    }
}
