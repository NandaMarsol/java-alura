package br.com.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception { // tratando a exce��o
		
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		// O Scanner possui o m�todo hasNextLine, que devolve false quando n�o existe mais nenhum conte�do a ser lido
		// nt�o, enquanto ainda houver conte�do, ou seja, enquanto o m�todo hasNextLine retornar true, leia a linha e imprima-a
		while (scanner.hasNextLine()) {
            String linha = scanner.nextLine(); // m�todo nextLine, leia a linha do arquivo, guarde-a em uma vari�vel e imprima-a
            System.out.println(linha);
            
            // Para separar os valores da linha, crie um novo Scanner. Ele receber� como entrada a pr�pria linha
            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(","); // separe os valores, utilizando um delimitador, atrav�s do m�todo useDelimiter
       
            //  Guarde os valores da linha, da conta, em vari�veis espec�ficas
            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();
            
 //           System.out.println(tipoConta + agencia + numero + titular + saldo);
            
            // Agora, remova a impress�o da linha e a impress�o dos valores da conta. Al�m disso, formate os valores da conta, atrav�s do String.format
//            String valorFormatado = String.format("%s - %d-%d, %s: %f", tipoConta, agencia, numero, titular, saldo);
//            System.out.println(valorFormatado);
            
            // Formate mais ainda a string, para que a ag�ncia tenha 4 caracteres no total, mas se tiver menos, que o restante seja preenchido com zeros.
            // Fa�a a mesma coisa para o n�mero da conta, mas para que tenha 8 caracteres no total, e se tiver menos, que o restante seja preenchido com zeros.
            // Para o nome do titular, que ele tenha 20 caracteres e para o saldo da conta, que ele possua 8 caracteres, sendo os 3 �ltimos o ponto e duas casas decimais
 //           String valorFormatado = String.format("%s - %04d-%08d, %20s: %08.2f", tipoConta,
 //                   agencia, numero, titular, saldo);
//            System.out.println(valorFormatado);

            // Por fim, para imprimir o saldo com uma v�rgula como separador entre o valor inteiro e o valor decimal, passe um Locale do Brasil como primeiro par�metro
            // Como n�o h� um existente para o Brasil, crie-o. Voc� tamb�m pode fazer o format diretamente no System.out, mas deve lembrar de pular uma linha ao final
            System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %08.2f%n", 
                    tipoConta, agencia, numero, titular, saldo);


            linhaScanner.close();
		}
		
		scanner.close();
		
		
    }

}
