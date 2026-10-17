/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InvertirCadenas;

/**
 *
 * @author ligoh
 */
public class InversorCadena {
    //metodo publico donde se hace primero las validaciones para enviarlo sanitizado
    public String invertir(String texto){
        // se valida si no es nulo
        if(texto == null){
            return "Error: texto nulo";
        }
        //pasa los parametros al metodo privado
        return invertirAuxiliar(texto, texto.length()-1);
    }
    private String invertirAuxiliar(String texto, int indice){
        //caso base
        if(indice < 0){
            return "";
        }
        //caso recursivo
        return texto.charAt(indice) + invertirAuxiliar(texto, indice - 1);
    } 
}
