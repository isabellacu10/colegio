/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colegio;

import colegio.modelo.Estudiante;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author UIS
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes= new ArrayList<>();
        
        while (true) {
            System.out.print("    MENU\n"+"1.REGISTRAR ESTUDIANTE\n"+"2. REGISTRAR MATERIAS\n"+"3. REGISTRAR NOTAS "+"4.MOSTRAR LISTA DE ESTUDIANTES\n"+"5.MOSTRAR PROMEDIO POR MATERIA\n"+"6.SALIR");
            int menu = sc.nextInt();
            
            switch (menu) {
                case 1:
                    resgistrarEstudiante(estudiantes);
                    
                    break;
                case 2:
                    resgistrarMaterias(estudiantes);
                    
                    break;
                case 3:
                    resgistrarNotas();
                    
                    break;
                case 4:
                    mostrarListas(estudiantes);
                    
                    break;
                case 5:
                    mostrarPromedio();
                    
                    break;
                case 6:
                    System.exit(0);
                    
                    break;
            }
            
        }
    }
    public static void resgistrarEstudiante(ArrayList<Estudiante> estudiantes) {
        Scanner est = new Scanner(System.in);
        System.out.println("Ingrese el ID del estudiante: ");
        int id = est.nextInt();
        System.out.println("Ingrese el nombre: ");
        String nombre = est.nextLine();
        System.out.println("Ingrese la direccion: ");
        String direccion = est.nextLine();
        System.out.println("Ingrese el telefono: ");
        String telefono = est.nextLine();
        Estudiante estudiante1 = new Estudiante(id, nombre, direccion, telefono);
        
        estudiantes.add(estudiante1);
        
        
    }
    public static void resgistrarMaterias(ArrayList<Estudiante> estudiantes){
        Scanner mat =new Scanner(System.in);
        System.out.println("Ingrese el ID del estudiante: ");
        int id = mat.nextInt();
        boolean encontrado = false;
        
        for (Estudiante es : estudiantes) {
            if (es.id==id){
                System.out.println("Ingrese el id de la materia: ");
                int idm = mat.nextInt();
                System.out.print("Ingrese la materia: ");
                String nombreMateri = mat.nextLine();
                System.out.println("Ingrese los creditos de la materia: ");
                int cre = mat.nextInt();
                
                
                
            }
            
        }
        
    }
    public static void resgistrarNotas(){
        
    }
    public static void mostrarListas(ArrayList<Estudiante> estudiantes){
        for (Estudiante e : estudiantes) {
            System.out.println("    FICHA\n"
                    + "ID: "+e.id+"\n"
                    + "NOMBRE: "+e.nombre+"\n"
                    + "DIRECCION: "+e.direccion+"\n"
                    + "TELEFONO:"+e.telefono);
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
    } 
    public static void mostrarPromedio(){
        
    } 
    
}
