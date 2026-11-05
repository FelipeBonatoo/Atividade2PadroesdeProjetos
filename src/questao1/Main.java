package questao1;

public class Main {

    public static void main(String[] args) {
        Produto fone = new Produto("Fone Bluetooth", 10);

        Observador compras = new Compras();
        Observador vendas = new Vendas();
        Observador auditoria = new Auditoria();

        fone.adicionarObservador(compras);
        fone.adicionarObservador(vendas);
        fone.adicionarObservador(auditoria);

        System.out.println("--- Estoque 10 -> 7 (sem alertas, só Auditoria registra)");
        fone.setQuantidade(7);

        System.out.println("--- Estoque 7 -> 4 (Compras alerta)");
        fone.setQuantidade(4);

        System.out.println("--- Estoque 4 -> 4 (sem mudança, ninguém é avisado)");
        fone.setQuantidade(4);

        System.out.println("--- Estoque 4 -> 0 (zerou)");
        fone.setQuantidade(0);

        System.out.println("--- Estoque 0 -> 12 (Vendas alerta: voltou ao estoque)");
        fone.setQuantidade(12);

        System.out.println("--- Removendo Compras em tempo de execução");
        fone.removerObservador(compras);

        System.out.println("--- Estoque 12 -> 3 (Compras não é mais avisada)");
        fone.setQuantidade(3);

        System.out.println("--- Estoque 3 -> 0 -> 8");
        fone.setQuantidade(0);
        fone.setQuantidade(8);
    }
}
