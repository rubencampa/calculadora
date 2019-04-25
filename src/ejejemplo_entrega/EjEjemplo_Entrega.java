/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejejemplo_entrega;

import FuncionesDeNumeros.claseFunc.*;
 
public class EjEjemplo_Entrega {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    // voltea //////////////////////////////////////////////////////

    System.out.println("El 5 volteado es " + FuncionesDeNumeros.claseFunc.voltea(5));
    System.out.println("El 398004321 volteado es " + FuncionesDeNumeros.claseFunc.voltea(398004321));
    System.out.println("El -75839 volteado es " + FuncionesDeNumeros.claseFunc.voltea(-75839));

        System.out.println();
    // digitoN /////////////////////////////////////////////////////
        System.out.println();

    System.out.println("En la posición 0 del 3452 está el " + FuncionesDeNumeros.claseFunc.digitoN(3452, 0));
    System.out.println("En la posición 6 del 857964034 está el " + FuncionesDeNumeros.claseFunc.digitoN(857964034, 6));
    System.out.println("En la posición 4 del 857964034 está el " + FuncionesDeNumeros.claseFunc.digitoN(857964034, 4));
        
        
        
    }
    
}
