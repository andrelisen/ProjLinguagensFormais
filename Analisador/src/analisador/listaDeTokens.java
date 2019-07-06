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

  

    public void inserir(String entrada) {
        
        
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
        }
        
        if(validade == 0){//com as condições anterior não deu para reconhecer, pode ser que seja um nome de função
            
            String caracter = entrada.substring(0);//estou pegando apenas o primeiro caracter, o que isso significa?
            //preciso reconhecer nome de funções, logo, utilizo a primeira caracter dela para verificar se é nome de uma função
            switch(caracter){
                    case "a":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                    
                     case "b":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                    
                     case "c":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                 
                     case "d":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
      
                     case "e":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                     
                     case "f":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                    
                     case "g":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                     
                     case "h":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                     
                     case "i":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                     
                     case "j":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                     
                     case "k":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                     
                     case "l":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                     
                     case "m":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                     
                     case "n":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                     
                     case "o":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                     
                     case "p":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                     
                     case "q":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                     
                     case "r":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                     
                     case "s":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                     
                     case "t":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                     
                     case "u":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                     
                     case "v":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                     
                     case "w":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                     
                     case "x":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                     
                     case "y":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                     
                     case "z":
                    this.rotulo = rotulos.NomeFunc;
                    this.elemento=caracter;
                    break;
                    
            }
            
        }
        
    }
    
    
    
}
