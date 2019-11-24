/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yareli
 */
public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol al = new Arbol(23);
       // Nodo nuevo= new Nodo(14);
//        al.agregar(nuevo, al.getRaiz());
        al.agregar(new Nodo(14), al.getRaiz());
        al.recorrerPreorden( al.getRaiz());
        
        
    }
    
}
