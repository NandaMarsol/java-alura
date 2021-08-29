package br.com.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Lilico");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Luna Marsol", 34672);
        Aluno a2 = new Aluno("Jared M", 5617);
        Aluno a3 = new Aluno("Lola", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        
        // iterando as matriculas com as expressões lambdas do Java 8
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });
	}

}
