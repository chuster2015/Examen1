/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Negocio;

/**
 *
 * @author Chuster
 */
    public class Mascota {
    //--------------------------------------------------------------------------
    //Atributos de la clase Mascota
    private String id;
    private String nombre;
    private int edad;
    private String especie;
    private String sexo;

    //--------------------------------------------------------------------------
   //Constructor sin parámetros de la clase Mascota
    public Mascota() {
        this.id="";
        this.nombre="";
        this.edad=0;
        this.especie="";
        this.sexo="";
    }
    //--------------------------------------------------------------------------
    //Constructor con parámetros de la clase Mascota
    public Mascota(String id, String nombre, int edad,String especie) {
        this.id = id;
        this.nombre=nombre;
        this.edad=edad;
        this.especie=especie;
    }
    //--------------------------------------------------------------------------
    //Métodos set de la clase Mascota
     public void setId(String id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
     public void setEspecie(String especie) {
        this.especie = especie;
    }
     public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    //--------------------------------------------------------------------------
    //Métodos get de la clase Mascota
    public String getNombre() {
        return nombre;
    }
    public String getId() {
        return id;
    }
    public int getEdad() {
        return edad;
    }
    public String getEspecie() {
        return especie;
    }
    
    public String getSexo() {
        return sexo;
    }
    //--------------------------------------------------------------------------
}
