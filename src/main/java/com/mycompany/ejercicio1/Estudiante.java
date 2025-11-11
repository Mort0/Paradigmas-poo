/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author Diego
 */
public class Estudiante extends Usuario{
    protected String grupo;
    protected String horarioClases;

    public Estudiante() {
    }

    public Estudiante(String grupo, String horarioClases, String nombre, int id, String passWord) {
        super(nombre, id, passWord);
        this.grupo = grupo;
        this.horarioClases = horarioClases;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getHorarioClases() {
        return horarioClases;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setHorarioClases(String horarioClases) {
        this.horarioClases = horarioClases;
    }
    
    public void subirTrabajos(){
        System.out.println("Subiendo trabajo...");}
    
    public void actualizarInformacion(){
        System.out.println("Actualizando informacion...");}
}
