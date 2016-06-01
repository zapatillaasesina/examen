import java.util.Scanner;
import java.util.Random;

public class Main_dolent {
	/**
	 * @param paraules conté totes les paraules que poden surtir al joc.
	 * @param index numero per seleccionar la paraula amb la qual es jugara.
	 * @param p visualitza la paraula.
	 */
    static protected String paraules[] = {"hola","programació","casa"};
    static protected int index;
    static protected String p;

    public static void main(String[] args) {
        System.out.println("Comença el joc!");
        /**
         * es genera un numero aleatori al parametre "index" per seleccionar
         * la paraula per jugar i la representa gracies al parametre "p",
         * que per cada lletra de la paraula es igual a "_".
         */

        Random rand = new Random();
        index = rand.nextInt(3);
        for (int i=0; i<paraules[index].length(); i++) {
            p += "_";
        }

        System.out.println(p);

        Scanner reader = new Scanner(System.in);
        /**
         * Comptador dels errors per cada lletra incorrecta, en arribar a 5
         * el joc s'acaba automàticament.
         * @param num_errors compta el nombre d'errors del jugador
         */
        int num_errors = 0;

        while (!p.equals(paraules[index]) && num_errors < 5) {
            if (!nova_lletra(reader.next().charAt(0))) {
                num_errors++;
            }
            System.out.println(p);
        }
   }
    /**
     * Classe per a que el jugador introdueixi una lletra i comprobar si es
     * troba a la paraula o no. si hi es, canvia "_" per la lletra.
     * @param nova: es la seguent lletra introduida per el jugador.
     * @return retorna la paraula 
     */

    static public boolean nova_lletra(char nova) {
        boolean trobada = false;
        String paraula_old = p;
        p = "";
        for (int i=0; i<paraules[index].length(); i++) {
            if (paraules[index].charAt(i) == nova) {
                p += paraules[index].charAt(i);
                trobada = true;
            }
            else {
                p += paraula_old.charAt(i);
            }
        }
        return trobada;
    }

}

