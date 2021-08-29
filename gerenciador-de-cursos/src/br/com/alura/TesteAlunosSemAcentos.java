package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunosSemAcentos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		
		// adicione alguns alunos
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");    

        // imprima o tamanho da colecao
        System.out.println(alunos.size());

        //tente adicionar um aluno que existe
        alunos.add("Pedro");

        // imprima novamente o tamanho da colecao
        System.out.println(alunos.size());
        
        // o método add devolve um booleano que indica o resultado
        boolean adicionou = alunos.add("Pedro");
        System.out.println("Pedro foi adicionado ao Set? " + adicionou);

	}

}
