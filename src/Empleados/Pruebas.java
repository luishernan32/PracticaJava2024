/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;

import java.util.*;

/**
 *
 * @author luis
 */
public class Pruebas {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        Empleados trabajador1=new Empleados("Luis");
        Empleados trabajador2=new Empleados("Pedro");
        
        trabajador1.cambiaSeccion("RRHH");
        trabajador1.cambioNombre("Hernán");
        System.out.println(" "+trabajador1.devuelveDatos());
        System.out.println(" "+trabajador2.devuelveDatos());
          
    }
    
}


class Empleados{
    
    public Empleados(String nom)
    {
        nombre=nom;
        seccion="Administracion";
    }
    
    public void cambiaSeccion(String seccion)
    {
        this.seccion=seccion;
    }
    
    public String devuelveDatos()
    {
        return "El nombre es: "+nombre+"y la seccion es: "+seccion;
    }
    
    public void cambioNombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    private String nombre;
    private String seccion;
}