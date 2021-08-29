package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {

	public static void main(String[] args) {
		
		// inicializando um HashSet
		Set<String> alunos = new HashSet<>();
        alunos.add("Luna");
        alunos.add("Luck");
        alunos.add("Jimmy");    
        alunos.add("Jared"); 
        
        // para cada aluno dentro do conjunto alunos, imprima
        for (String aluno : alunos) {
        	System.out.println(aluno); // o Set não mantém a ordem de inserção
		}

	}

}
