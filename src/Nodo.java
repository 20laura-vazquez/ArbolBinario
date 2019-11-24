/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yareli
 */
public class Nodo {
    private int dato;
    private Object izdo;
    private Object dcho;

    public Nodo(int dato) {
        this.dato = dato;
        izdo=dcho= null;
    }

    public Nodo(int dato, Object izquierdo, Object derecho) {
        this.dato = dato;
        this.izdo = izquierdo;
        this.dcho = derecho;
    }

    public int  getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Object getIzdo() {
        return izdo;
    }

    public void setIzdo(Object izdo) {
        this.izdo = izdo;
    }

    public Object getDcho() {
        return dcho;
    }

    public void setDcho(Object dcho) {
        this.dcho = dcho;
    }
    
    
    
    
    
    
}
