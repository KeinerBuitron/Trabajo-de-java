/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;
import javax.swing.JOptionPane;
public class Principal {

  
    public static void main(String[] args) {
        String menu = JOptionPane.showInputDialog("MENU \n"+
                                                  "1. Empleado \n"+
                                                  "2. Cliente \n"+
                                                  "3. Salir \n");
        
        int opciones = Integer.parseInt(menu);
    
    switch (opciones){
        case 1:
            String nombreEmp = JOptionPane.showInputDialog("Ingrese el nombre");
            int edadEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario"));
            Empleado emp = new Empleado(salario, nombreEmp, edadEmpleado);
            emp.mostrarEmpleado();
            break;
            
        case 2:
            String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre");
            int edadCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
            String direccionEmpleado = JOptionPane.showInputDialog("Ingrese la direccion");
            Cliente cli = new Cliente( direccionEmpleado,nombreCliente,edadCliente);
            cli.mostrarCliente();
            break;
            
        case 3:
            break;
    }
        
    }
    
}
