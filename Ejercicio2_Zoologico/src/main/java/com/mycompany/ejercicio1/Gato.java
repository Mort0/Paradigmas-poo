/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author Diego
 */
public class Gato extends Mamifero{


    public Gato() {
    }

    public Gato(boolean glandulasMamarias, String nombre, int edad, String tipoSangre) {
        super(glandulasMamarias, nombre, edad, tipoSangre);
    }
 
    @Override
    public void sonido (){
        System.out.println("El gato maulla...");}        
    
}
