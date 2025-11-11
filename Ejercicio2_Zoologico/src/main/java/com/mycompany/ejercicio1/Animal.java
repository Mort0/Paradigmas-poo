/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author Diego
 */
public class Animal {
    protected String nombre;
    protected int edad;
    protected String tipoSangre;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public Animal() {
    }

    public Animal(String nombre, int edad, String tipoSangre) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoSangre = tipoSangre;
    }

    
    public void sonido(){
        System.out.println("El animal hace sonido...");}
    public void mostrarDatos(){
        System.out.println("Mostrando datos...");}
}
