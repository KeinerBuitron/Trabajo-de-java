/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import javax.swing.JOptionPane;


public class Cliente extends Persona{
    private String direccion;
//constructor

    public Cliente(String direccion, String nombre, int edad) {
        super(nombre, edad);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public void mostrarCliente(){
        JOptionPane.showMessageDialog( null, "El nombre es "+getNombre()+
                                            "\nLa edad es "+getEdad()+
                                            "\nLa direccion es "+getDireccion());
    }
}