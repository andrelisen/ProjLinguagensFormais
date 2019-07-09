package analisador;

import java.util.ArrayList;
import java.util.List;

public class Pilha {
    public List<Token> pilha;

    public Pilha() {
        pilha = new ArrayList();
        this.pilha.clear();
    }
    
    public void inserir(Token elemento){
        this.pilha.add(elemento);
    }
    
    public Token remover(){
        Integer ultimo = this.pilha.size() - 1;
        Token elemento = this.pilha.get(ultimo);
        this.pilha.remove(elemento);
        return elemento;
    }

    public void imprimir(){
        System.out.println("Pilha:");
        for (Token token : pilha) {
            System.out.println(token.getElemento());
        }
        System.out.println("-----------------");
        System.out.println("                 ");
    }
}
