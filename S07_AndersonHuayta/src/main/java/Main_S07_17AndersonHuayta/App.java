/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main_S07_17AndersonHuayta;

/**
 *
 * @author Lab16
 */
public class App {

        
        public static void main(String[] args) {
      
        persona2_17 persona1 = new persona2_17("Anderson", 18, false);
 
        persona1.mostrarDatos();
        System.out.println("Nombre del estudiante: " + persona1.getNombre());
        System.out.println("Edad del estudiante: " + persona1.getEdad());
        System.out.println("¿Está aprobado? " + persona1.peso());

       //Persona//
        persona_17 persona = new persona_17();
        persona.pregunta();
        persona.respuesta();
        
    }
}
    

