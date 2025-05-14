public class CorridaDeSapos2 {
    final static int NUM_SAPOS = 5; // QTE. de sapos na corrida
    final static int DISTANCIA = 500; // Distância da corrida em cm
    public static void main (String[] args) {
        /* colocando sapos na corrida */
        for (int i = 1; i <= NUM_SAPOS; i++) {
            new SapoCorrendoThread("SAPO_" + i, DISTANCIA).start();
        }
    }
}