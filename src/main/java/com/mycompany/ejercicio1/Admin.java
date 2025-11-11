/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author Diego
 */
public class Admin extends Usuario{
    
    protected String horarioTrabajo;
    
    public Admin() {
    }

    public Admin(String horarioTrabajo, String nombre, int id, String passWord) {
        super(nombre, id, passWord);
        this.horarioTrabajo = horarioTrabajo;
    }

    public void modificarNota(){
        System.out.println("Modificando nota...");}
    
    public void eliminarNota(){
        System.out.println("Eliminando nota...");}
    
    public void asignarPermiso(){
        System.out.println("Asignando permisos...");}
    
    public void agregarUsuarios(){
        System.out.println("Agregando usuario...");}
    
    public void eliminarUsuario(){
        System.out.println("Eliminando usuario...");}
    
    public void crearNota (){
        System.out.println("Creando nota...");}
    
    public void verListaUsuarios(){
        System.out.println("Viendo la lsita de usuarios");}
    
}
