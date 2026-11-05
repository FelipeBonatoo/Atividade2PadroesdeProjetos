package questao1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Registra toda alteração de estoque. */
public class Auditoria implements Observador {

    private final List<String> registros = new ArrayList<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        String registro = "Produto: " + nomeProduto + " | Nova quantidade: " + novaQuantidade;
        registros.add(registro);
        System.out.println("[AUDITORIA] Registro #" + registros.size() + " -> " + registro);
    }

    public List<String> getRegistros() {
        return Collections.unmodifiableList(registros);
    }
}
