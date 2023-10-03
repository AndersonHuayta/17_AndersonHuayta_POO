/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main_S07_17AndersonHuayta;

/**
 *
 * @author Lab16
 */
import javax.swing.JOptionPane;


public class persona2_17 {


   String nombre;
    int edad;
    boolean peso;


  public persona2_17() {}

  public persona2_17(String nombre, int edad, boolean aprobado) {
    this.nombre = nombre;
    this.edad = edad;
    this.peso = peso;
  }


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public boolean peso() {
    return peso;
  }

  public void setpeso(boolean peso) {
    this.peso = peso;
  }

  public void mostrarDatos() {
    JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nEdad: " + edad + "\nAprobado: " + peso);
  }
}
