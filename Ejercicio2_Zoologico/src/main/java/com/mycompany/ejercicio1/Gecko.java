/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author Diego
 */
public class Gecko extends Reptil{

    public Gecko() {
    }

    public Gecko(boolean ponerHuevos, String nombre, int edad, String tipoSangre) {
        super(ponerHuevos, nombre, edad, tipoSangre);
    }
    @Override
    public void sonido(){
        System.out.println("El gecko chasquea...");}
}
