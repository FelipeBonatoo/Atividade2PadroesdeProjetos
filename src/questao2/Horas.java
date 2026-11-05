package questao2;

/** Utilitário para conversão de minutos em horas iniciadas. */
final class Horas {

    private static final int MINUTOS_POR_HORA = 60;

    private Horas() {
    }

    /** 0 min = 0h; 1 a 60 min = 1h; 61 min = 2h; e assim por diante. */
    static int iniciadas(int minutos) {
        if (minutos <= 0) {
            return 0;
        }
        return (minutos + MINUTOS_POR_HORA - 1) / MINUTOS_POR_HORA;
    }
}
