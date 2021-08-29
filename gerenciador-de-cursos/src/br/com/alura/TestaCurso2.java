package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Luck Marsol");
//      List<Aula> aulas = javaColecoes.getAulas();
//      System.out.println(aulas);
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

        System.out.println(javaColecoes.getAulas());
        
        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulas);
        System.out.println(aulas);
        
        System.out.println(javaColecoes.getTempoTotal());
        
        // imprimindo ToString da classe Curso
        System.out.println(javaColecoes);
	}
}


/* Em vez de declararmos a referência a uma ArrayList<Aula> (ou LinkedList<Aula>), o ideal é deixarmos mais genérico, utilizando a interface List
* Não temos motivo para ser super específico na instância que iremos usar; 
* Se declararmos apenas como List, poderemos mudar de implementação, como para uma LinkedList, sem problema algum de compilação, por não termos nos comprometido com uma implementação em específico.
*/