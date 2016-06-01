

import java.util.Scanner;
import java.util.Random;

public class Main_dolent {
	/**
	 * @author Jordi Garcia
	 * @param paraules: total de paraules que pot conté el joc.
	 * @param index: valor per determinar quina sera la paraula amb la qual jugarem.
	 * @param p: lletres de la paraules representadas com "_"
	 */
	

    static protected String paraules[] = {"hola","programació","casa"}; 
    static protected int index;
    static protected String p;

    public static void main(String[] args) {
    	/**
    	 * @param num_errors: numero total d'errors que ha comés el jugador.
    	 */
    	int num_errors = 0;
        System.out.println("Comença el joc!");
        /**
         * es genera un numero aleatori per seleccionar la paraula per jugar i el representa.
         */
        Random rand = new Random();
        index = rand.nextInt(3);
        for (int i=0; i<paraules[index].length(); i++) {
            p = "_";
        }

        System.out.println(p);

        Scanner reader = new Scanner(System.in);

        
        /**
         * comptador de errors, cada cop que es falla una lletra augmenta el comptador, en arrivar a 5 has perdut.
         */
        while (!p.equals(paraules[index]) && num_errors < 5) {
            if (!nova_lletra(reader.next().charAt(0))) {
                num_errors++;
            }
            System.out.println(p);
        }
   }
    /**
     * classe per a que el jugador introdueixi una lletra i comprobar si es troba a la paraula o no. si hi es, canvia "_" per la lletra.
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

