/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricularalumno;
import java.util.Scanner;
/**
 *
 * @author Jairo
 */
public class MatricularAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        
        Scanner al = new Scanner(System.in);
        System.out.println("¿Cuántos alumnos deseas matricular? "
                + "- Introduza cantidad numérica: ");
        
        int numeroAlumnos = al.nextInt();
        
        Alumnos arrayAl[] = new Alumnos[numeroAlumnos];
        
        for(int j= 0; j < numeroAlumnos; j++){
            
            //Set the alum name
            //Introducir el nombre del alumno
            Scanner nom = new Scanner(System.in);
            System. out.println("\n"+"Introduzca nombre: ");
            String nombreAl = nom.nextLine();
            
            //Set the surname
            //Introducir el apellido del alumno
            Scanner ape = new Scanner(System.in);
            System. out.println("\n"+"Introduzca apellido: ");
            String apellidoAl = ape.nextLine();
            //Set the alumn's Identity National Document
            //Introducir el DNI del alumno
            Scanner dni = new Scanner(System.in);
            System. out.println("\n"+"Introduzca DNI: ");
            String dniAl = dni.nextLine();
            
            
            //Save alumn information in an object "Alumnos"
            //Guardamos la información del alumno en un objeto "Alumnos"
            Alumnos alum = new Alumnos (nombreAl, apellidoAl, dniAl );
            
            //Set "Alumnos" object inside the array
            //Asignamos el objeto "Alumnos" en el array
            arrayAl [j] = alum;
            
            }
            //Print the information inside the array
            //Recorremos el Array e imprimimos por pantalla la información de los alumnos
            for(int i= 0; i<arrayAl.length; i++){
                
                System.out.println("Matrícula de alumno nº: "+ arrayAl[i].getMatricula());
                System.out.println("Nombre de alumno: "+arrayAl[i].getNombre() + " Apellido: "
                        +arrayAl[i].getApellidos()+ " DNI del alumno: " + arrayAl[i].getDNI());
                
            }
        }
   
            
    }
    