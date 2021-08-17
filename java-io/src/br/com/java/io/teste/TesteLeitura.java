package br.com.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException { //tratando a exce��o, adicionando um throws
		
		// Fluxo de Entrada com arquivo
		FileInputStream fis = new FileInputStream("lorem.txt"); // instanciando um FileInputStream e utilizando o construtor que recebe o caminho do arquivo como par�metro
		InputStreamReader isr = new InputStreamReader(fis); // o FileInputStream somente l� os bytes, instancie a classe InputStreamReader para transformar esses bytes em caracteres, recebe um InputStream como par�metro no construtor
		BufferedReader br = new BufferedReader(isr); // instanciando a classe BufferedReader para poder ler a linha inteira do arquivo, ela recebe um Reader como par�metro no construtor

		// atrav�s do m�todo readLine, do BufferedReader, leia a linha do arquivo e guarde-a em uma vari�vel
		String linha = br.readLine();
		
		// o m�todo readLine devolve null quando n�o existe mais nenhum conte�do a ser lido
		// ent�o, enquanto ainda houver conte�do, ou seja, enquanto a linha n�o for nula, imprima-a e continue lendo o arquivo
		while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();
	}

}
