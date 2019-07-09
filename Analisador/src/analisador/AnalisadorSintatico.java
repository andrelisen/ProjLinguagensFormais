package analisador;

import java.util.List;

public class AnalisadorSintatico {
    String saida;
    
    public void bottomUp(List<Token> lista) {
        Pilha pilha = new Pilha();
        for (int i = 0; i < lista.size(); i++) {
            String elemento = lista.get(i).elemento;
            if ((i + 1) < lista.size()) {
                Token proximo = lista.get(i + 1);
            }
            
            
            if (elemento.length() > 1) {
                int tamanhoPalavra = elemento.length();
                for (int j = 0; j < tamanhoPalavra; j++) {
                    String caracter = elemento.substring(0, 1);
                    pilha = transicoes1(caracter, pilha);
                    elemento = elemento.substring(1, elemento.length());
                }
            } else {
                pilha = transicoes1(elemento, pilha);
            }

        }
        pilha.imprimir();
    }

    public Pilha transicoes1(String elemento, Pilha pilha) {
        switch (elemento) {
            case "(":
                pilha.inserir(elemento);
                System.out.println("Transição 1.3");
                break;

            case ")":
                pilha.inserir(elemento);
                System.out.println("Transição 1.4");
                break;

            case "0":
                pilha.inserir(elemento);
                System.out.println("Transição 1.2");
                break;

            case "1":
                pilha.inserir(elemento);
                System.out.println("Transição 1.2");
                break;

            case "2":
                pilha.inserir(elemento);
                System.out.println("Transição 1.2");
                break;

            case "3":
                pilha.inserir(elemento);
                System.out.println("Transição 1.2");
                break;

            case "4":
                pilha.inserir(elemento);
                System.out.println("Transição 1.2");
                break;

            case "5":
                pilha.inserir(elemento);
                System.out.println("Transição 1.2");
                break;

            case "6":
                pilha.inserir(elemento);
                System.out.println("Transição 1.2");
                break;

            case "7":
                pilha.inserir(elemento);
                System.out.println("Transição 1.2");
                break;

            case "8":
                pilha.inserir(elemento);
                System.out.println("Transição 1.2");
                break;

            case "9":
                pilha.inserir(elemento);
                System.out.println("Transição 1.2");
                break;

            case "a":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "b":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "c":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "d":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "e":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "f":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "g":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "h":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "i":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "j":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "k":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "l":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "m":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "n":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "o":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "p":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "q":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "r":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "s":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "t":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "u":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "v":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "w":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "x":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "y":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "z":
                pilha.inserir(elemento);
                System.out.println("Transição 1.1");
                break;

            case "if":
                pilha.inserir(elemento);
                System.out.println("Transição 1.19");
                break;

            case "++":
                pilha.inserir(elemento);
                System.out.println("Transição 1.5");
                break;

            case "--":
                pilha.inserir(elemento);
                System.out.println("Transição 1.6");
                break;

            case "not":
                pilha.inserir(elemento);
                System.out.println("Transição 1.15");
                break;

            case "+":
                pilha.inserir(elemento);
                System.out.println("Transição 1.5");
                break;

            case "-":
                pilha.inserir(elemento);
                System.out.println("Transição 1.6");
                break;

            case "*":
                pilha.inserir(elemento);
                System.out.println("Transição 1.7");
                break;

            case "=":
                pilha.inserir(elemento);
                break;

            case "/":
                pilha.inserir(elemento);
                System.out.println("Transição 1.8");
                break;

            case "gt":
                pilha.inserir(elemento);
                System.out.println("Transição 1.9");
                break;

            case "geq":
                pilha.inserir(elemento);
                System.out.println("Transição 1.11");
                break;

            case "leq":
                pilha.inserir(elemento);
                System.out.println("Transição 1.12");
                break;

            case "neq":
                pilha.inserir(elemento);
                System.out.println("Transição 1.14");
                break;

            case "and":
                pilha.inserir(elemento);
                System.out.println("Transição 1.16");
                break;
            case "or":
                pilha.inserir(elemento);
                System.out.println("Transição 1.17");
                break;

            default:
                System.out.println("Erro! Símbolo não identificado");
        }
        return pilha;
    }
    
    public Pilha transicoes2(Pilha pilha, Token proximo){
        String elemento = pilha.remover();
        switch(elemento){
            case "listaDeFuncoes":
                pilha.inserir("programa");
                break;
            
             case "A'funcao":
                if(proximo.getRotulo() == Rotulo.NomeFunc){
                    pilha.inserir("listaDeFuncoes");
                }
                break;     
                
                
           
            
        }
        
        return pilha;
    }

}
