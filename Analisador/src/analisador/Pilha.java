package analisador;

import java.util.ArrayList;
import java.util.List;

public class Pilha {
    public List<String> pilha;

    public Pilha() {
        pilha = new ArrayList();
        this.pilha.clear();
    }
    
    public void inserir(String elemento){
        this.pilha.add(elemento);
    }
    
    public String remover(){
        Integer ultimo = this.pilha.size() - 1;
        String elemento = this.pilha.get(ultimo);
        this.pilha.remove(elemento);
        return elemento;
    }

    public void imprimir(){
        System.out.println("Pilha:");
        for (String elemento : pilha) {
            System.out.println(elemento);
        }
        System.out.println("-----------------");
        System.out.println("                 ");
    }
}
