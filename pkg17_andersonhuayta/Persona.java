
package pkg17_andersonhuayta;
import java.util.Scanner;

public class Persona {
    String nombre;
    int altura;
    int edad;
    String sexo;
    
    public void pregunta(){
    Scanner persona = new Scanner(System.in);
    System.out.println("Ingrese su nombre: ");
    nombre = persona.nextLine();
    System.out.println("Ingrese su altura: ");
    altura = persona.nextInt();
    System.out.println("Ingrese su edad: ");
    edad = persona.nextInt();
    System.out.println("Ingre su genero: ");
    sexo = persona.nextLine();
    }
    
    public void respuesta (){
    System.out.println("Su nombre es " + nombre + " su altura es: "+ altura+" su edad es: "+ edad + " Su genero es: " + sexo);
    }
    
}
