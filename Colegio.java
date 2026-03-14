/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colegio;

import colegio.modelo.Estudiante;
import colegio.modelo.Materia;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class Colegio {
static ArrayList<Estudiante> estudiantes= new ArrayList<>();
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes= new ArrayList<>();
        
        while (true) {            
            
            System.out.println("      MENU\n"+"1. REGISTRAR ESTUDIANTE\n"+"2. REGISTRAR MATERIA\n"+"3. REGISTRAR NOTA\n"+"4. LISTAR\n"+"5.PROMEDIO DE ESTUDIANTE\n"+"6. SALIR");
            int menu = sc.nextInt();
            sc.nextLine();
            
            switch (menu) {
                case 1:
                    registrarE(estudiantes);
                    
                    break;
                case 2:
                    registrarM(estudiantes);
                    break;
                case 3:
                    registrarN(estudiantes);
                    break;
                case 4:
                    listar(estudiantes);
                    break;
                case 5:
                    promedio(estudiantes);
                    break;
                case 6:
                    System.exit(0);
                    break;
      
            }
        
        }
        
    
    }
    public static void registrarE(ArrayList<Estudiante>estudiantes) {
        System.out.println("Ingrese el Id: "); 
        int id = sc.nextInt();
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        String nombree = sc.nextLine();
        System.out.println("Ingrese su direccion: ");
        String direccion =sc.nextLine();
        System.out.println("Ingrese el telefono: ");
        String telefono =sc.nextLine();
        Estudiante estudiante1 =new Estudiante(id, nombree, direccion, telefono);
        estudiantes.add(estudiante1);
        System.out.println("Estudiante registrado correctamente");
        
    }
    public static void registrarM(ArrayList<Estudiante>estudiantes) {
        System.out.print("Ingrese ID del estudiante: ");
        int id = sc.nextInt();
        for (Estudiante e : estudiantes) {
            if (e.id==id){
                System.out.println("Ingrese el ID de la materia: ");
                int idm = sc.nextInt();
                System.out.println("Estudiante encontrado: "+id);
                System.out.print("Nombre de materia: "); 
                String nombre = sc.nextLine();
                String nombre1 = sc.nextLine();
                System.out.print("Ingrese creditos: "); 
                String credito = sc.nextLine();
                Materia materia1 = new Materia(idm, nombre1, credito);
                e.materias.add(materia1);
                System.out.println("Materia asignada para: "+nombre1);
               
                break;
            }else{
                System.out.println("No se encontro el estudiante"); 
            }
        }
    }
    public static void registrarN(ArrayList<Estudiante>estudiantes){
        System.out.print("Ingrese ID del estudiante: ");
        int id = sc.nextInt();
        for (Estudiante e : estudiantes) {
            if (e.id==id){
                System.out.print("Ingrese ID de la materia: ");
                int idm = sc.nextInt();
                for (Materia m : e.materias) {
                    if (m.idm == idm){
                        System.out.println("Ingrese la nota de la materia: ");
                        float n1 = sc.nextFloat();
                        m.notas.add(n1);
                    }else{
                        System.out.println("Materia no encontrada");
                    }
                }  
            }else{
                System.out.println("El estudiante no fue encontrado");
            }
        
        }
    }
    public static void promedio(ArrayList<Estudiante>estudiantes) {
        System.out.print("Ingrese ID del estudiante: ");
        int id = sc.nextInt();
        for (Estudiante e : estudiantes) {
            if (e.id==id){
               float suma = 0;
               int cantidadn =0;
                for (Materia m : e.materias) {
                    for (Float nota : m.notas) {
                        suma+=nota;
                        cantidadn++;
                    } 
                }
                if (cantidadn>0){
                    float promediof= suma/cantidadn;
                    System.out.println("el promedio general de "+e.nombre+" es de: "+promediof);
                }else{
                    System.out.println("El estudiante no tiene notas registradas");
                }
            }
        }
    }
    public static void listar(ArrayList<Estudiante>estudiantes) {
        for (Estudiante e : estudiantes) {
            System.out.println("    FICHA \n"
                    +"ID: "+e.id
                    +"\n"+"NOMBRE: "+e.nombre
                    +"\n"+"DIRECCION: "+e.direccion
                    +"\n"+"TELEFONO: "+e.telefono
                    +"\n"+"MATERIA: "+e.materias);
        }
    }
}
