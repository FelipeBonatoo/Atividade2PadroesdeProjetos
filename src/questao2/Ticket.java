package questao2;


public class Ticket {

    private final String placa;
    private final int minutosPermanencia;
    private EstrategiaCobranca estrategia;

    public Ticket(String placa, int minutosPermanencia, EstrategiaCobranca estrategia) {
        this.placa = placa;
        this.minutosPermanencia = minutosPermanencia;
        this.estrategia = estrategia;
    }

    /** RQ2.6: troca o perfil de cobrança em tempo de execução. */
    public void setEstrategia(EstrategiaCobranca estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularValor() {
        return estrategia.calcular(minutosPermanencia);
    }

    public String getPlaca() {
        return placa;
    }

    public int getMinutosPermanencia() {
        return minutosPermanencia;
    }

    public String getPerfil() {
        return estrategia.getNome();
    }
}
