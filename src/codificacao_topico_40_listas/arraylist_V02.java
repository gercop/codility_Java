package codificacao_topico_40_listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Aula implements Comparable<Aula>{
	
	private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }
    
    @Override
    public String toString() {
        return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
    }
    
    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo);
    }
}

public class arraylist_V02 {

	/*
	 * https://www.alura.com.br/conteudo/java-collections?gclid=EAIaIQobChMI-piphtDw9wIV6UVIAB2dJQiUEAAYASAAEgKrrvD_BwE
	 */
	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revistando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);
        
        Collections.sort(aulas);
        
        System.out.println();
        System.out.println(aulas);
        
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println();
        System.out.println(aulas);
        
        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println();
        System.out.println(aulas);

	}

}
