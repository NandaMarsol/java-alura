package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole??es do Java", "Luck Marsol");
//      List<Aula> aulas = javaColecoes.getAulas();
//      System.out.println(aulas);
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

        System.out.println(javaColecoes.getAulas());
	}
}


/* Em vez de declararmos a refer?ncia a uma ArrayList<Aula> (ou LinkedList<Aula>), o ideal ? deixarmos mais gen?rico, utilizando a interface List
* N?o temos motivo para ser super espec?fico na inst?ncia que iremos usar; 
* Se declararmos apenas como List, poderemos mudar de implementa??o, como para uma LinkedList, sem problema algum de compila??o, por n?o termos nos comprometido com uma implementa??o em espec?fico.
*/