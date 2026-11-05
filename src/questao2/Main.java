package questao2;

public class Main {

    public static void main(String[] args) {
        int permanencia = 95;

        System.out.println("=== Mesmo tempo (" + permanencia + " min) nos três perfis ===");
        EstrategiaCobranca[] perfis = {
                new CobrancaRotativa(),
                new CobrancaMensalista(),
                new CobrancaConveniado()
        };
        for (EstrategiaCobranca perfil : perfis) {
            Ticket ticket = new Ticket("ABC-1D23", permanencia, perfil);
            System.out.printf("%-11s -> R$ %.2f%n", ticket.getPerfil(), ticket.calcularValor());
        }

        System.out.println();
        System.out.println("=== Troca de perfil no mesmo tíquete ===");
        Ticket ticket = new Ticket("XYZ-9K88", 120, new CobrancaRotativa());
        imprimir(ticket);

        ticket.setEstrategia(new CobrancaConveniado());
        imprimir(ticket);

        ticket.setEstrategia(new CobrancaMensalista());
        imprimir(ticket);
    }

    private static void imprimir(Ticket ticket) {
        System.out.printf("Placa %s, %d min, perfil %s -> R$ %.2f%n",
                ticket.getPlaca(), ticket.getMinutosPermanencia(),
                ticket.getPerfil(), ticket.calcularValor());
    }
}
