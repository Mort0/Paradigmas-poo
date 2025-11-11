/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author Diego
 */
public class Mamifero extends Animal{
    
    protected boolean glandulasMamarias;
    
    public Mamifero() {
    }

    public Mamifero(boolean glandulasMamarias, String nombre, int edad, String tipoSangre) {
        super(nombre, edad, tipoSangre);
        this.glandulasMamarias = glandulasMamarias;
    }

    public boolean isGlandulasMamarias() {
        return glandulasMamarias;
    }

    public void setGlandulasMamarias(boolean glandulasMamarias) {
        this.glandulasMamarias = glandulasMamarias;
    }

    public void amamantar(){
        System.out.println("El mamifero amamanta...");}
    
   
}
