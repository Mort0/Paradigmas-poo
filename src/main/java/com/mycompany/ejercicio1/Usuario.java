/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author Diego
 */
public class Usuario {
    protected String nombre;
    protected int id;
    protected String passWord;

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Usuario() {
    }

    public Usuario(String nombre, int id, String passWord) {
        this.nombre = nombre;
        this.id = id;
        this.passWord = passWord;
    }
    
    public void leerNota(){
        System.out.println("Leyendo nota...");}
    public void logearse(){
        System.out.println("Ingresando...");}
}
