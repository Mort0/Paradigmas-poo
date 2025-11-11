/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author Diego
 */
public class Profesor extends Usuario{
    protected String materiaAsignada;
    protected String horarioClases;

    public Profesor() {
    }

    public Profesor(String materiaAsignada, String horarioClases, String nombre, int id, String passWord) {
        super(nombre, id, passWord);
        this.materiaAsignada = materiaAsignada;
        this.horarioClases = horarioClases;
    }

    public String getMateriaAsignada() {
        return materiaAsignada;
    }

    public String getHorarioClases() {
        return horarioClases;
    }

    public void setMateriaAsignada(String materiaAsignada) {
        this.materiaAsignada = materiaAsignada;
    }

    public void setHorarioClases(String horarioClases) {
        this.horarioClases = horarioClases;
    }
    
    
    public void crearNota (){
        System.out.println("Creando nota...");}    
    
    public void eliminarNota(){
        System.out.println("Eliminando nota...");}
    
    public void editarNota(){
        System.out.println("Editando nota...");}
    
    public void administrarNota(){
        System.out.println("Administrando nota...");}
    
    
}
