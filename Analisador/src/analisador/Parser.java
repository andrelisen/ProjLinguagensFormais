/*
A partir da gramática alterada e dos elementos identificados no passo anterior, escreva
um analisador sintático determinístico (Parser) (top-down ou bottom-up) que reconheça
programas escritos na linguagem L e gere a lista de transições usadas no processo de
reconhecimento.
 */
package analisador;

/**
 *
 * @author andrelise
 */
public class Parser {
    
    public double transicao;
    public Token pilha;
    public Token entrada;
    
    public Parser(Token token) {
    
        
        
    }
    
    public void identificar(Token input){
        
        //esse switch reconhece a entrada que no nosso caso é uma lista de tokens com todos do arq TXT, e eles estão classificados conforme a descrição
        //do projeto
        switch(input.getRotulo()){
            //TRANSIÇÕES DO TIPO 1 - EMPILHA UM SIMBOLO NÃO TERMINAL NA PILHA 
            /* (p, a, E, p, a)
               (p, 1, E, p, 1)
                p, (, E, p, (
                p, ), E, p, )
                p,+, E, p, +
                p, -, E, p, -
                p, *, E, p, *
                p, /, E, p ,/
                p, gt,E, p, gt
                p, lt, E, p lt
                p, geq, E, p, geq
                p, leq, E, p, leq
                p, lq, E, p, lq
                p, neq, E, p, neq
                p, not, E, p, not
                p, and, E, p, and
                p, or, E, p, or
                p, defun, E, p, defun
                p, if, E, p, if*/
                
            case DelimEsq://parentese esquerdo (
                System.out.println("Parentese identificado mas o que eu faco com ele? ");
                transicao = 1.1;
                break;
            
            
        }
        
    }
    
}
