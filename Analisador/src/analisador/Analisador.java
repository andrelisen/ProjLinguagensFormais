
package analisador;

import java.util.Scanner;

/**
 *
 * @author andrelise
 */
public class Analisador {

    /*Escreva um analisador léxico (autômato finito determinístico) que separe os itens do
    programa em identificadores, números, operadores e demais símbolos delimitadores da
    linguagem, conforme a gramática dada. O programa deve receber o código fonte como
    entrada e produzir, como saída, uma lista de elementos rotulados, que será denominada
    lista de tokens. Cada elemento rotulado contém o elemento (tipo String) e o rótulo do
    elemento (tipo Enumeração ou similar). Os rótulos possíveis são os seguintes: DelimEsq
    (parêntese esquerdo), DelimDir (parêntese direito), OpUn (operador unário), OpBin (operador binário), 
    TesteCond (teste condicional), NomeFunc (nome de função) e Num (número). 
    Se precisar de mais rótulos, identifique-os e diga o que significam.*/
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int opcaoMenu = 0;
        String nomeArquivo;
        
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Digite o nome do arquivo que desejas ler para reconhecer:");
        nomeArquivo = ler.nextLine();
        System.out.println("-------------------------------------------------------------------------");
        
        
    }
    
}
