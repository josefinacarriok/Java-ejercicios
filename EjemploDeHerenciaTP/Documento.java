/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documento;

/**
 *
 * @author alumno
 */
public class Documento {
    protected int _numero;
    
    public Documento(int numero){
        this._numero = numero;
        System.out.println("constructor documento");
    }
    
    public void setterNumero(int numero){
        this._numero = numero;
    }
    
    public void mostrarNumero(){
        System.out.println("El numero es: "+this._numero);
    }
    
    public void MostrarDatosCompletos(){
        this.mostrarNumero();
    }
}
