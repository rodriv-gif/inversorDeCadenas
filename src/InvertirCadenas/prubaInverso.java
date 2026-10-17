/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InvertirCadenas;

import java.util.Scanner;

/**
 *
 * @author ligoh
 */
public class prubaInverso {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        InversorCadena inverso = new InversorCadena();
        
        System.out.println("Ingresa una palabra");
        String texto = entrada.nextLine();
        
        String resultado = inverso.invertir(texto);
        System.out.println("Texto invertido: " + resultado);
    }
}
