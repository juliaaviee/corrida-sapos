/* Aplicação que simula uma corrida de sapos usando threads */
public class CorridaDeSapos {
    final static int NUM_SAPOS = 5; // QTE. de sapos na corrida
    final static int DISTANCIA = 500; // Distância da corrida em cm
    public static void main (String[] args) {
        /* Criando as threads para representar os sapos correndo */
        SapoCorrendoThread sapo_1 = new SapoCorrendoThread("SAPO_01", DISTANCIA);
        SapoCorrendoThread sapo_2 = new SapoCorrendoThread("SAPO_02", DISTANCIA);
        SapoCorrendoThread sapo_3 = new SapoCorrendoThread("SAPO_03", DISTANCIA);
        SapoCorrendoThread sapo_4 = new SapoCorrendoThread("SAPO_04", DISTANCIA);
        SapoCorrendoThread sapo_5 = new SapoCorrendoThread("SAPO_05", DISTANCIA);
        /* Estabelecendo prioridades para as threads */
        sapo_1.setPriority(Thread.MIN_PRIORITY);
        sapo_2.setPriority(Thread.MIN_PRIORITY);
        sapo_3.setPriority(Thread.NORM_PRIORITY);
        sapo_4.setPriority(Thread.MAX_PRIORITY);
        sapo_5.setPriority(Thread.MAX_PRIORITY);
        /* Iniciando as threads */
        sapo_1.start();
        sapo_2.start();
        sapo_3.start();
        sapo_4.start();
        sapo_5.start();
    }
}