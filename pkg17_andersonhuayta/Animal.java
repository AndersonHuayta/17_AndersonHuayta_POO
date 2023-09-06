
package pkg17_andersonhuayta;

import javax.swing.JOptionPane;

public class Animal {
    String nombre;
    String tipodeanimal;
    String raza;
    String habitad;
    
    public void datos(){
    nombre = JOptionPane.showInputDialog("Ingrese el nombre del animal: ");
    tipodeanimal = JOptionPane.showInputDialog("Ingrese el tipo de animal que es: ");
    raza = JOptionPane.showInputDialog("Ingrese que raza de animal es: ");
    habitad = JOptionPane.showInputDialog("Ingrese que habitad se encuentra el animal: ");
        
    }
    public void respuesta () {
    JOptionPane.showMessageDialog(null,"El nombre del animal es: "+nombre);
    JOptionPane.showMessageDialog(null,"El tipo de animal es: "+tipodeanimal);
    JOptionPane.showMessageDialog(null,"La raza de este animal es: "+raza);
    JOptionPane.showMessageDialog(null,"El habitad donde vive es: "+habitad);
    
    
}
}