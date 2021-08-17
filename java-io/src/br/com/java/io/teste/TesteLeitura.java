package br.com.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException { //tratando a exceção, adicionando um throws
		
		// Fluxo de Entrada com arquivo
		FileInputStream fis = new FileInputStream("lorem.txt"); // instanciando um FileInputStream e utilizando o construtor que recebe o caminho do arquivo como parâmetro
		InputStreamReader isr = new InputStreamReader(fis); // o FileInputStream somente lê os bytes, instancie a classe InputStreamReader para transformar esses bytes em caracteres, recebe um InputStream como parâmetro no construtor
		BufferedReader br = new BufferedReader(isr); // instanciando a classe BufferedReader para poder ler a linha inteira do arquivo, ela recebe um Reader como parâmetro no construtor

		// através do método readLine, do BufferedReader, leia a linha do arquivo e guarde-a em uma variável
		String linha = br.readLine();
		
		// o método readLine devolve null quando não existe mais nenhum conteúdo a ser lido
		// então, enquanto ainda houver conteúdo, ou seja, enquanto a linha não for nula, imprima-a e continue lendo o arquivo
		while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();
	}

}
