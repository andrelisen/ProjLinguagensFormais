/*
    uma lista de elementos rotulados, que será denominada
    lista de tokens. Cada elemento rotulado contém o elemento (tipo String) e o rótulo do
    elemento (tipo Enumeração ou similar). Os rótulos possíveis são os seguintes: DelimEsq
    (parêntese esquerdo), DelimDir (parêntese direito), OpUn (operador unário), OpBin (operador binário), 
    TesteCond (teste condicional), NomeFunc (nome de função) e Num (número). 
*/
package analisador;

/**
 *
 * @author andrelise
 */
public class listaDeTokens {
    
    String elemento;
    rotulos rotulo;

  

    public listaDeTokens(String entrada) {
        
        
        int validade = 0;
        
        switch(entrada){
        
            case "(":
                this.rotulo = rotulos.DelimEsq;// DelimEsq, DelimDir, OpUn, OpBin, TesteCond, NomeFunc, Num;
                this.elemento="(";
                validade = 1;
                break;
        
            case ")":
                this.rotulo = rotulos.DelimDir;// DelimEsq, DelimDir, OpUn, OpBin, TesteCond, NomeFunc, Num;
                this.elemento=")";
                validade = 1;
                break;
            
            case "0":
                this.rotulo = rotulos.Num;// DelimEsq, DelimDir, OpUn, OpBin, TesteCond, NomeFunc, Num;
                this.elemento="0";
                validade = 1;
                break;
            
            case "1":
                this.rotulo = rotulos.Num;// DelimEsq, DelimDir, OpUn, OpBin, TesteCond, NomeFunc, Num;
                this.elemento="1";
                validade = 1;
                break;
           
            case "2":
                this.rotulo = rotulos.Num;// DelimEsq, DelimDir, OpUn, OpBin, TesteCond, NomeFunc, Num;
                this.elemento="2";
                validade = 1;
                break;
            
            case "3":
                this.rotulo = rotulos.Num;// DelimEsq, DelimDir, OpUn, OpBin, TesteCond, NomeFunc, Num;
                this.elemento="3";
                validade = 1;
                break;
            
            case "4":
                this.rotulo = rotulos.Num;// DelimEsq, DelimDir, OpUn, OpBin, TesteCond, NomeFunc, Num;
                this.elemento="4";
                validade = 1;
                break;
            
            case "5":
                this.rotulo = rotulos.Num;// DelimEsq, DelimDir, OpUn, OpBin, TesteCond, NomeFunc, Num;
                this.elemento="5";
                validade = 1;
                break;    
            
            case "6":
                this.rotulo = rotulos.Num;// DelimEsq, DelimDir, OpUn, OpBin, TesteCond, NomeFunc, Num;
                this.elemento="6";
                validade = 1;
                break;
            
            case "7":
                this.rotulo = rotulos.Num;// DelimEsq, DelimDir, OpUn, OpBin, TesteCond, NomeFunc, Num;
                this.elemento="7";
                validade = 1;
                break;
            
            case "8":
                this.rotulo = rotulos.Num;// DelimEsq, DelimDir, OpUn, OpBin, TesteCond, NomeFunc, Num;
                this.elemento="8";
                validade = 1;
                break;
            
            case "9":
                this.rotulo = rotulos.Num;// DelimEsq, DelimDir, OpUn, OpBin, TesteCond, NomeFunc, Num;
                this.elemento="9";
                validade = 1;
                break;
            
            case "if":
                this.rotulo = rotulos.TesteCond;
                this.elemento="if";
                validade = 1;
                break;
            
            case "++":
                this.rotulo = rotulos.OpUn;
                this.elemento="++";
                validade = 1;
                break;
            
            case "--":
                this.rotulo = rotulos.OpUn;
                this.elemento="++";
                validade = 1;
                break;
            
            case "not":
                this.rotulo = rotulos.OpUn;
                this.elemento="not";
                validade = 1;
                break;
            
            case"+":
                this.rotulo = rotulos.OpBin;              
                this.elemento="+";
                validade = 1;
                break;
            
            case"-":
                this.rotulo = rotulos.OpBin;
                this.elemento="-";
                validade = 1;
                break;
            
            case"*":
                this.rotulo = rotulos.OpBin;
                this.elemento="*";
                validade = 1;
                break;
            
            case"=":
                this.rotulo = rotulos.OpBin;
                this.elemento="=";
                validade = 1;
                break;
                
            case"/":
                this.rotulo = rotulos.OpBin;
                this.elemento="/";
                validade = 1;
                break;
            
            case"gt":
                this.rotulo = rotulos.OpBin;
                this.elemento="gt";
                validade = 1;
                break;
      
            case"geq":
                this.rotulo = rotulos.OpBin;
                this.elemento="geq";
                validade = 1;
                break;
            
            case"leq":
                this.rotulo = rotulos.OpBin;
                this.elemento="leq";
                validade = 1;
                break;
            
            case"neq":
                this.rotulo = rotulos.OpBin;
                this.elemento="neq";
                validade = 1;
                break;
            
            case"and":
                this.rotulo = rotulos.OpBin;
                this.elemento="and";
                validade = 1;
                break;
                
            case"or":
                this.rotulo = rotulos.OpBin;
                this.elemento="or";
                validade = 1;
                break;
            
        }
        
        if(validade == 0){//com as condições anterior não deu para reconhecer, pode ser que seja um nome de função
            
            String caracter = entrada.substring(0,1);//estou pegando apenas o primeiro caracter, o que isso significa?
              //  System.out.println("O caracter cortado fica como="+caracter);
            //preciso reconhecer nome de funções, logo, utilizo a primeira caracter dela para verificar se é nome de uma função
            switch(caracter){
                    case "a":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                    
                     case "b":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                    
                     case "c":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                 
                     case "d":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
      
                     case "e":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                     
                     case "f":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                    
                     case "g":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                     
                     case "h":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                     
                     case "i":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                     
                     case "j":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                     
                     case "k":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                     
                     case "l":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                     
                     case "m":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                     
                     case "n":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                     
                     case "o":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                     
                     case "p":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                     
                     case "q":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                     
                     case "r":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                     
                     case "s":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                     
                     case "t":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                     
                     case "u":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                     
                     case "v":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                     
                     case "w":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                     
                     case "x":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                     
                     case "y":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                     
                     case "z":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=entrada;
                    break;
                    
            }
            
        }
        
    }

    public String getElemento() {
        return elemento;
    }

    public rotulos getRotulo() {
        return rotulo;
    }
    
    
    
}
