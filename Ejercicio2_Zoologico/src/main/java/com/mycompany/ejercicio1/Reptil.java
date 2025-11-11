/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author Diego
 */
public class Reptil extends Animal{
    protected boolean ponerHuevos;

    public Reptil() {}

        public Reptil(boolean ponerHuevos, String nombre, int edad, String tipoSangre) {
            super(nombre, edad, tipoSangre);
            this.ponerHuevos = ponerHuevos;
        }

    public boolean isPonerHuevos() {
        return ponerHuevos;
    }

    public void setPonerHuevos(boolean ponerHuevos) {
        this.ponerHuevos = ponerHuevos;
    }

  
    public void ecdisis(){
        System.out.println("El reptil pone huevos...");}
    

}
