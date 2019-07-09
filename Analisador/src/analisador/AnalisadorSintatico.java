package analisador;

import java.util.List;

public class AnalisadorSintatico {

    String saida;

    public void bottomUp(List<Token> lista) {
        Pilha pilha = new Pilha();
        for (int i = 0; i < lista.size(); i++) {
            String elemento = lista.get(i).elemento;
            if ((i + 1) < lista.size()) { //este if impede que o programa tente pegar um elemento inexistente quano i for o ultimo elemento da lista de tokens
                Token proximo = lista.get(i + 1);
            }

            if (elemento.length() > 1) {
                int tamanhoPalavra = elemento.length();
                for (int j = 0; j < tamanhoPalavra; j++) {
                    String caracter = elemento.substring(0, 1);
                    pilha = transicoes1(caracter, pilha);
                    elemento = elemento.substring(1, elemento.length());
                    pilha = transicoes2(pilha);
                    pilha.imprimir();
                }
            } else {
                pilha = transicoes1(elemento, pilha);

            }
            pilha = transicoes2(pilha);
            pilha.imprimir();
        }
        pilha.imprimir();

        while (!pilha.remover().equals("programa")) {
            pilha = transicoes2(pilha);
            pilha.imprimir();
        }

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

    public Pilha transicoes2(Pilha pilha) {
        String elemento = pilha.remover();
        Pilha aux = pilha;
        switch (elemento) {
            case "listaDeFuncoes":
                if (aux.remover().equals("funcao")) {
                    pilha.inserir("A'");
                    System.out.println("Transição 2.3");
                } else {
                    pilha.inserir("programa");
                    System.out.println("Transição 2.1");
                }
                break;

            case "A'":
                if (aux.remover().equals("funcao")) {
                    pilha.inserir("listaDeFuncoes");
                    System.out.println("Transição 2.2");
                }
                break;

            case ")":
                if (aux.remover().equals("corpo")) {
                    pilha.remover();//corpo
                    if (aux.remover().equals("corpo")) {
                        pilha.remover();//corpo
                        //)corpo corpo
                        pilha.remover(); //cond
                        pilha.remover();//if
                        pilha.remover();//(
                        pilha.inserir("corpo");
                        System.out.println("Transição 2.6");
                    } else if (aux.remover().equals(")")) {
                        pilha.remover();//)
                        //)corpo)  
                        pilha.remover();//params
                        pilha.remover();//(
                        pilha.remover();//id
                        pilha.remover();//defun
                        pilha.remover();//(
                        pilha.inserir("funcao");
                        System.out.println("Transição 2.5");
                    } else {
                        //)corpo 
                        pilha.remover(); //id
                        pilha.remover(); //(
                        pilha.inserir("corpo");
                        System.out.println("Transição 2.7");
                    }
                } else if (aux.remover().equals("exp")) {
                    pilha.remover(); //exp
                    pilha.remover(); //exp
                    if (aux.remover().equals("+") || aux.remover().equals("-") || aux.remover().equals("*") || aux.remover().equals("/")) {
                        pilha.remover();// + / - * 
                        pilha.remover();//(
                        pilha.inserir("exp");
                        System.out.println("Transição 2.15 - 2.17");
                    } else if (aux.remover().equals("gt") || aux.remover().equals("lt") || aux.remover().equals("geq") || aux.remover().equals("leq") || aux.remover().equals("eq")) {
                        pilha.remover();// operação
                        pilha.remover();//(
                        pilha.inserir("cond");
                        System.out.println("Transição 2.18 - 2.22");
                    }

                } else if (aux.remover().equals("cond")) {
                    pilha.remover(); //cond
                    pilha.remover(); //cond
                    if (aux.remover().equals("not") || aux.remover().equals("or")) {
                        pilha.remover();// not or
                        pilha.remover(); //(
                        pilha.inserir("cond");
                        System.out.println("Transição 2.23 - 2.24");
                    }

                }
                break;

            case "exp":
                pilha.inserir("corpo");
                System.out.println("Transição 2.8");
                break;

            case "B'":
                if (aux.remover().equals("id")) {
                    pilha.remover();//id
                    pilha.inserir("params");
                    System.out.println("Transição 2.9");
                }
                break;

            case "params":
                pilha.inserir("B'");
                System.out.println("2.10");
                break;

            case "num":
                pilha.inserir("exp");
                System.out.println("2.12");
                break;

            case "id":
                pilha.inserir("exp");
                System.out.println("2.13");
                break;

            case "seqsimb":
                if (aux.remover().equals("letra")) {
                    if (aux.remover().equals("letra")) {
                        pilha.remover();
                        pilha.remover();
                        pilha.inserir("seqsimb");
                        System.out.println("Transição 2.30");
                    }
                } else if (aux.remover().equals("digito")) {
                    pilha.remover();//digito
                    pilha.inserir("seqsimb");
                    System.out.println("Transição 2.31");
                } else {
                    pilha.remover();
                    pilha.inserir("id");
                    System.out.println("Transição 2.25");
                }
                break;

            case "C'":
                if (aux.remover().equals("digito")) {
                    pilha.remover();//digito
                    pilha.inserir("num");
                    System.out.println("Transição 2.26");
                }
                break;

            case "letra": {
                pilha.inserir("seqsimb");
                System.out.println("Transição ");
            }

            //digitos
            case "0":
                pilha.inserir("digito");
                System.out.println("Transição 2.33");
                break;

            case "1":
                pilha.inserir("digito");
                System.out.println("Transição 2.33");
                break;

            case "2":
                pilha.inserir("digito");
                System.out.println("Transição 2.33");
                break;

            case "3":
                pilha.inserir("digito");
                System.out.println("Transição 2.33");
                break;

            case "4":
                pilha.inserir("digito");
                System.out.println("Transição 2.33");
                break;

            case "5":
                pilha.inserir("digito");
                System.out.println("Transição 2.33");
                break;

            case "6":
                pilha.inserir("digito");
                System.out.println("Transição 2.33");
                break;

            case "7":
                pilha.inserir("digito");
                System.out.println("Transição 2.33");
                break;

            case "8":
                pilha.inserir("digito");
                System.out.println("Transição 2.33");
                break;

            case "9":
                pilha.inserir("digito");
                System.out.println("Transição 2.33");
                break;

            //letras
            case "a":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "b":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "c":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "d":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "e":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "f":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "g":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "h":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "i":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "j":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "k":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "l":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "m":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "n":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "o":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "p":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "q":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "r":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "s":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "t":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "u":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "v":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "w":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "x":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "y":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;

            case "z":
                pilha.inserir("letra");
                System.out.println("Transição 2.32");
                break;
        }

        return pilha;
    }

}
