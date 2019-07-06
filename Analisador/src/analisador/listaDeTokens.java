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

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public rotulos getRotulo() {
        return rotulo;
    }

    public void setRotulo(rotulos rotulo) {
        this.rotulo = rotulo;
    }
    
    
    
}
