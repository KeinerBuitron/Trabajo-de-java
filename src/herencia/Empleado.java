/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import javax.swing.JOptionPane;

public class Empleado extends Persona{
    private double salario;
  
 //constructor

    public Empleado(double salario, String nombre, int edad) {
        super(nombre, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    
    public void mostrarEmpleado (){
        JOptionPane.showMessageDialog(null, "El nombre es "+getNombre()+
                                            "\nLa edad es "+getEdad()+
                                            "\nEl salario es "+getSalario());
            
}
}