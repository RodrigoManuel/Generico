/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
package generico;
 
public class Golosina {
    //atributo
    private String nombre;

    //métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Golosina(String nombre) {
        //super();
        this.nombre = nombre;
    }
 
}
