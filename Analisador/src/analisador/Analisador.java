
package analisador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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
    
    public static void main(String[] args) throws IOException {
        
        Scanner ler = new Scanner(System.in);
        
        int opcaoMenu = 0;
        String nomeArquivo;
        
       // Token tokens = new Token();
       
        ArrayList<Token> tokens = new ArrayList();
        
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Digite o nome do arquivo que desejas ler para reconhecer:");
        nomeArquivo = ler.nextLine();
        
        Scanner scanner = new Scanner(new FileReader(new File(nomeArquivo)));
        
        String palavra="";
        
        while (scanner.hasNext()) {          
        	String line = scanner.nextLine();
        	String[] caract = line.split("");
                 
                
                for(int i = 0; i< caract.length; i++){
                    if(caract[i].equals(" ")){
                    //    System.out.println("dentro do if: "+palavra);
                        Token token = new Token(palavra);
                        tokens.add(token);
                      //  System.out.println(palavra);
                        palavra = "";
                      //  System.out.println("Detectei espaço YEYY");
                    }else{
                        palavra = palavra + "" +caract[i];
                    //    System.out.println(palavra);
                    }
                }
                
        }
        
        System.out.println("Imprimindo a lista de tokens que foi identificado!!");
        
        int quantidade = tokens.size();
            
            for(int i = 0; i<quantidade; i++){
                
                Token auxLer = tokens.get(i);
                System.out.println(auxLer.getElemento());
                System.out.println(auxLer.getRotulo());
                
            }
      
        System.out.println("-------------------------------------------------------------------------");
        
        
        //analisador sintático
        AnalisadorSintatico as = new AnalisadorSintatico();
        as.bottomUp(tokens);
        
    }    
}
