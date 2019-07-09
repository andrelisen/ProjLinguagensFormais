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
                break;

            case ")":
                pilha.inserir(elemento);
                break;

            case "0":
                pilha.inserir(elemento);
                break;

            case "1":
                pilha.inserir(elemento);
                break;

            case "2":
                pilha.inserir(elemento);
                break;

            case "3":
                pilha.inserir(elemento);
                break;

            case "4":
                pilha.inserir(elemento);
                break;

            case "5":
                pilha.inserir(elemento);
                break;

            case "6":
                pilha.inserir(elemento);
                break;

            case "7":
                pilha.inserir(elemento);
                break;

            case "8":
                pilha.inserir(elemento);
                break;

            case "9":
                pilha.inserir(elemento);
                break;

            case "a":
                pilha.inserir(elemento);
                break;

            case "b":
                pilha.inserir(elemento);
                break;

            case "c":
                pilha.inserir(elemento);
                break;

            case "d":
                pilha.inserir(elemento);
                break;

            case "e":
                pilha.inserir(elemento);
                break;

            case "f":
                pilha.inserir(elemento);
                break;

            case "g":
                pilha.inserir(elemento);
                break;

            case "h":
                pilha.inserir(elemento);
                break;

            case "i":
                pilha.inserir(elemento);
                break;

            case "j":
                pilha.inserir(elemento);
                break;

            case "k":
                pilha.inserir(elemento);
                break;

            case "l":
                pilha.inserir(elemento);
                break;

            case "m":
                pilha.inserir(elemento);
                break;

            case "n":
                pilha.inserir(elemento);
                break;

            case "o":
                pilha.inserir(elemento);
                break;

            case "p":
                pilha.inserir(elemento);
                break;

            case "q":
                pilha.inserir(elemento);
                break;

            case "r":
                pilha.inserir(elemento);
                break;

            case "s":
                pilha.inserir(elemento);
                break;

            case "t":
                pilha.inserir(elemento);
                break;

            case "u":
                pilha.inserir(elemento);
                break;

            case "v":
                pilha.inserir(elemento);
                break;

            case "w":
                pilha.inserir(elemento);
                break;

            case "x":
                pilha.inserir(elemento);
                break;

            case "y":
                pilha.inserir(elemento);
                break;

            case "z":
                pilha.inserir(elemento);
                break;

            case "if":
                pilha.inserir(elemento);
                break;

            case "++":
                pilha.inserir(elemento);
                break;

            case "--":
                pilha.inserir(elemento);
                break;

            case "not":
                pilha.inserir(elemento);
                break;

            case "+":
                pilha.inserir(elemento);
                break;

            case "-":
                pilha.inserir(elemento);
                break;

            case "*":
                pilha.inserir(elemento);
                break;

            case "=":
                pilha.inserir(elemento);
                break;

            case "/":
                pilha.inserir(elemento);
                break;

            case "gt":
                pilha.inserir(elemento);
                break;

            case "geq":
                pilha.inserir(elemento);
                break;

            case "leq":
                pilha.inserir(elemento);
                break;

            case "neq":
                pilha.inserir(elemento);
                break;

            case "and":
                pilha.inserir(elemento);
                break;

            case "or":
                pilha.inserir(elemento);
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
                
            case "A'":
                if(proximo.getRotulo() == Rotulo.NomeFunc){
                    pilha.inserir("listaDeFuncoes");
                }
                break;            
            
            
        }
        
        return pilha;
    }

}
