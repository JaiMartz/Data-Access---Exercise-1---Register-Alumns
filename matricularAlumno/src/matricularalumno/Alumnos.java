/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricularalumno;
/**
 *
 * @author Jairo
 */
public class Alumnos {
    
    //static - el atributo pertenece a la clase
    public static int numero_de_matriculas = 0;
    private String nombre;
    private String apellidos;
    private String DNI;
    private int matricula;
    
    
    public Alumnos (){
        //Se incrementa el valo con cada objeto Alumnos que se crea
        numero_de_matriculas++;
    }
    public Alumnos (String nomb, String ape, String DNI){
        this.numero_de_matriculas++;
        this.nombre = nomb;
        this.apellidos = ape;
        this.DNI = DNI;
        this.matricula = numero_de_matriculas;
    }
    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matr){
        this.matricula = matr;
    }
    public int getNumMatricula (){
        return numero_de_matriculas;
    }
    public void setNumMatricula(int matr){
        this.numero_de_matriculas = matr;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nomb){
        this.nombre = nomb;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String ape){
        this.apellidos = ape;
    }
    public String getDNI(){
        return DNI;
    }
    public void setDNI(String DNI){
        this.DNI = DNI;
    }
}
