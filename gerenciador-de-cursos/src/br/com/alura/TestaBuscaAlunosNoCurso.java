package br.com.alura;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Lilico");

		// aulas
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        // alunos
        Aluno a1 = new Aluno("Luna Marsol", 34672);
        Aluno a2 = new Aluno("Jared M", 5617);
        Aluno a3 = new Aluno("Lola", 17645);

        // matriculando os alunos
        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        
        System.out.println("Quem é o aluno(a) da matrícula 5617?");
        Aluno aluno = javaColecoes.buscaMatricula(5617);
        System.out.println("Aluno(a): " + aluno);
        
	}

}
