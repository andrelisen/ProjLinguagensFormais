package analisador;

import java.util.List;

public class AnalisadorSintatico {

    Integer flag = 0;
    String saida;

    public void bottomUp(List<Token> lista) {
        Pilha pilha = new Pilha();
        Pilha aux = new Pilha();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) != null) {
                Token token = lista.get(i);
                if (i + 1 != lista.size()) {
                    Token prox = lista.get(i + 1);
                }
                String elemento = token.getElemento();
                int tamanhoPalavra = elemento.length();

                if (token.getRotulo() == Rotulo.NomeFunc) { //nomes de funcao
                    for (int j = 0; j < tamanhoPalavra; j++) {
                        String caracter = elemento.substring(0, 1);
                        Token t = new Token(caracter, Rotulo.NomeFunc);
                        pilha = transicoes1(t, pilha);
                        pilha.imprimir();
                        elemento = elemento.substring(1, elemento.length());

//                        aux = pilha;
//                        while (!aux.remover().equals("(")) {
//                            pilha = transicoes2(pilha);
//                            pilha.imprimir();
//                        }
                        pilha = transicoes2a(t, pilha);
                        pilha.imprimir();
                    }
                } else {
                    pilha = transicoes1(token, pilha);
                    pilha.imprimir();
                }
                pilha = transicoes2a(token, pilha);
                pilha.imprimir();
                if (i >= 2 && i != lista.size()) {
                    pilha = transicoes2b(pilha);
                }
            }
        }
        pilha.imprimir();
    }

    public Pilha transicoes1(Token token, Pilha pilha) {
        String elemento = token.getElemento();
        switch (elemento) {
            case "(":
                pilha.inserir(token);
                System.out.println("Transição 1.3");
                break;

            case ")":
                pilha.inserir(token);
                System.out.println("Transição 1.4");
                break;

            case "0":
                pilha.inserir(token);
                System.out.println("Transição 1.2");
                break;

            case "1":
                pilha.inserir(token);
                System.out.println("Transição 1.2");
                break;

            case "2":
                pilha.inserir(token);
                System.out.println("Transição 1.2");
                break;

            case "3":
                pilha.inserir(token);
                System.out.println("Transição 1.2");
                break;

            case "4":
                pilha.inserir(token);
                System.out.println("Transição 1.2");
                break;

            case "5":
                pilha.inserir(token);
                System.out.println("Transição 1.2");
                break;

            case "6":
                pilha.inserir(token);
                System.out.println("Transição 1.2");
                break;

            case "7":
                pilha.inserir(token);
                System.out.println("Transição 1.2");
                break;

            case "8":
                pilha.inserir(token);
                System.out.println("Transição 1.2");
                break;

            case "9":
                pilha.inserir(token);
                System.out.println("Transição 1.2");
                break;

            case "a":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "b":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "c":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "d":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "e":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "f":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "g":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "h":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "i":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "j":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "k":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "l":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "m":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "n":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "o":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "p":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "q":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "r":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "s":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "t":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "u":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "v":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "w":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "x":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "y":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "z":
                pilha.inserir(token);
                System.out.println("Transição 1.1");
                break;

            case "if":
                pilha.inserir(token);
                System.out.println("Transição 1.19");
                break;

            case "++":
                pilha.inserir(token);
                System.out.println("Transição 1.5");
                break;

            case "--":
                pilha.inserir(token);
                System.out.println("Transição 1.6");
                break;

            case "not":
                pilha.inserir(token);
                System.out.println("Transição 1.15");
                break;

            case "+":
                pilha.inserir(token);
                System.out.println("Transição 1.5");
                break;

            case "-":
                pilha.inserir(token);
                System.out.println("Transição 1.6");
                break;

            case "*":
                pilha.inserir(token);
                System.out.println("Transição 1.7");
                break;

            case "=":
                pilha.inserir(token);
                break;

            case "/":
                pilha.inserir(token);
                System.out.println("Transição 1.8");
                break;

            case "gt":
                pilha.inserir(token);
                System.out.println("Transição 1.9");
                break;

            case "geq":
                pilha.inserir(token);
                System.out.println("Transição 1.11");
                break;

            case "leq":
                pilha.inserir(token);
                System.out.println("Transição 1.12");
                break;

            case "neq":
                pilha.inserir(token);
                System.out.println("Transição 1.14");
                break;

            case "and":
                pilha.inserir(token);
                System.out.println("Transição 1.16");
                break;
            case "or":
                pilha.inserir(token);
                System.out.println("Transição 1.17");
                break;

            case "defun":
                pilha.inserir(token);
                System.out.println("Transição 1.18");
                break;

            default:
                System.out.println("Erro! Símbolo não identificado: " + elemento);
        }
        return pilha;
    }

    public Pilha transicoes2a(Token token, Pilha pilha) {
        Pilha aux = pilha;
        Token novo;
        String elemento = token.getElemento();

        switch (elemento) {
            //digitos
            case "0":
                pilha.remover();
                novo = new Token("digito", Rotulo.Num);
                pilha.inserir(novo);
                System.out.println("Transição 2.33");
                break;

            case "1":
                pilha.remover();
                novo = new Token("digito", Rotulo.Num);
                pilha.inserir(novo);
                System.out.println("Transição 2.33");
                break;

            case "2":
                pilha.remover();
                novo = new Token("digito", Rotulo.Num);
                pilha.inserir(novo);
                System.out.println("Transição 2.33");
                break;

            case "3":
                pilha.remover();
                novo = new Token("digito", Rotulo.Num);
                pilha.inserir(novo);
                System.out.println("Transição 2.33");
                break;

            case "4":
                pilha.remover();
                novo = new Token("digito", Rotulo.Num);
                pilha.inserir(novo);
                System.out.println("Transição 2.33");
                break;

            case "5":
                pilha.remover();
                novo = new Token("digito", Rotulo.Num);
                pilha.inserir(novo);
                System.out.println("Transição 2.33");
                break;

            case "6":
                pilha.remover();
                novo = new Token("digito", Rotulo.Num);
                pilha.inserir(novo);
                System.out.println("Transição 2.33");
                break;

            case "7":
                pilha.remover();
                novo = new Token("digito", Rotulo.Num);
                pilha.inserir(novo);
                System.out.println("Transição 2.33");
                break;

            case "8":
                pilha.remover();
                novo = new Token("digito", Rotulo.Num);
                pilha.inserir(novo);
                System.out.println("Transição 2.33");
                break;

            case "9":
                pilha.remover();
                novo = new Token("digito", Rotulo.Num);
                pilha.inserir(novo);
                System.out.println("Transição 2.33");
                break;

            //letras
            case "a":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "b":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "c":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "d":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "e":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "f":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "g":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "h":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "i":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "j":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "k":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "l":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "m":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "n":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "o":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "p":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "q":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "r":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "s":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "t":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "u":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "v":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "w":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "x":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "y":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

            case "z":
                pilha.remover();
                novo = new Token("letra", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.32");
                break;

        }
        return pilha;
    } //transicoes que modificam numeros e letras na pilha

    public Pilha transicoes2b(Pilha pilha) {
        Token novo;
        Pilha aux = pilha;
        Token token = aux.remover();
        String elemento = token.getElemento();
        Token prox = aux.remover();

        switch (elemento) {
            case "letra":
                if (prox.getRotulo() == Rotulo.NomeFunc) {
                    pilha.remover(); //letra
                    pilha.remover(); //letra
                    novo = new Token("seqsimb", Rotulo.NomeFunc);
                    pilha.inserir(novo);
                    System.out.println("Transição 2.30");
                } else if (prox.getRotulo() != Rotulo.DecFunc && prox.getRotulo() != Rotulo.DelimDir && prox.getRotulo() != Rotulo.DelimEsq) {
                    pilha.remover(); //letra
                    novo = new Token("seqsimb", Rotulo.NomeFunc);
                    pilha.inserir(novo);
                    System.out.println("Transição 2.35");
                }
                break;

            case "digito":
                if (prox.getRotulo() == Rotulo.NomeFunc) {
                    pilha.remover(); //letra
                    pilha.remover(); //letra
                    novo = new Token("seqsimb", Rotulo.NomeFunc);
                    pilha.inserir(novo);
                    System.out.println("Transição 2.36");
                } else if (prox.getRotulo() == Rotulo.Num) {
                    pilha.remover(); //digito
                    pilha.remover(); //num
                    novo = new Token("num", Rotulo.Num);
                    System.out.println("Transição 2.36");
                    pilha.inserir(novo);
                } else {
                    pilha.remover(); //digito
                    novo = new Token("num", Rotulo.Num);
                    pilha.inserir(novo);
                    System.out.println("Transição 2.36");
                }
                break;
            case "seqsimb":
                pilha.remover(); //seqsimb
                novo = new Token("id", Rotulo.NomeFunc);
                pilha.inserir(novo);
                System.out.println("Transição 2.25");
                break;
        }

        pilha.imprimir();
        return pilha;
    }
//    public Pilha transicoes2(Pilha pilha, Token prox) {
//        Pilha aux = pilha;
//        Token token = aux.remover();
//        Token novo;
//        String elemento = token.getElemento();
//
//        switch (elemento) {
//            case "listaDeFuncoes":
//                if (prox.getRotulo() == Rotulo.DelimEsq) { //A' -> listaDeFuncoes
//                    pilha.remover();
//                    novo = new Token("A'", Rotulo.NomeFunc);
//                    System.out.println("Transição 2.3");
//                } else {
//                    pilha.remover();
//                    novo = new Token("programa", Rotulo.NomeFunc);
//                    System.out.println("Transição 2.1");
//                }
//                break;
//
//            case ")":
//                if (prox.getRotulo() == Rotulo.TesteCond) {
//                    //cond
//                } else if (prox.getRotulo() == Rotulo.OpBin) {
//                    //exp
//                } else {
//                    //corpo
//
//                }
//                break;
//
//            case "exp":
//                pilha.inserir("corpo");
//                System.out.println("Transição 2.8");
//                break;
//
//            case "B'":
//                if (aux.remover().equals("id")) {
//                    pilha.remover();//id
//                    pilha.inserir("params");
//                    System.out.println("Transição 2.9");
//                }
//                break;
//
//            case "params":
//                pilha.inserir("B'");
//                System.out.println("2.10");
//                break;
//
//            case "num":
//                pilha.inserir("exp");
//                System.out.println("2.12");
//                break;
//
//            case "id":
//                pilha.inserir("exp");
//                System.out.println("2.13");
//                break;
//
//            case "C'":
//                if (aux.remover().equals("digito")) {
//                    pilha.remover();//digito
//                    pilha.inserir("num");
//                    System.out.println("Transição 2.26");
//                }
//                break;
//
//            default:
//                //avisar quando não existem mais substituiçoes possiveis para esse elemento
//                //rodar a função até poder substuir tudo
//                flag = 1;
//                break;
//        }
//
//        return pilha;
//    }
}
