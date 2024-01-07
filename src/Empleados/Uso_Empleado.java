/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.*;
/**
 *
 * @author luis
 */
public class Uso_Empleado {
    
    public static void main(String[] args) {
        
        Empleado[] misEmpleados=new Empleado[4];
        
       misEmpleados[0]=new Empleado("Paco Gómez",85000,1990,12,17);
       misEmpleados[1]=new Empleado("Ana Lopez",95000,1993,12,5);
       misEmpleados[2]=new Empleado("Maria Martín",10050,2002,12,06);
       misEmpleados[3]=new Empleado("Luis");
       
      /* for(int i=0; i<misEmpleados.length;i++)
       {
           misEmpleados[i].subeSueldo(5);           
       }
       
        for (int i = 0; i < misEmpleados.length; i++) {
            System.out.println("Nombre :"+misEmpleados[i].dameNombre()+
                " Sueldo: "+misEmpleados[i].dameSueldo()+
                " Fecha de Alta: "+misEmpleados[i].dameFechaContrato());
        }
       */
       
       for(Empleado e: misEmpleados)
       {
           e.subeSueldo(5);
       }
       
       for(Empleado e: misEmpleados)
       {
          System.out.println("Nombre :"+e.dameNombre()+
                " Sueldo: "+e.dameSueldo()+
                " Fecha de Alta: "+e.dameFechaContrato());
       }
       
       /* Empleado empleado1=new Empleado("Paco Gómez",85000,1990,12,17);
        Empleado empleado2=new Empleado("Ana Lopez",95000,1993,12,05);
        Empleado empleado3=new Empleado("Maria Martín",10050,2002,12,15);
        
        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);
        
        System.out.println("Nombre :"+empleado1.dameNombre()+
                " Sueldo: "+empleado1.dameSueldo()+
                " Fecha de Alta: "+empleado1.dameFechaContrato());
        
         System.out.println("Nombre :"+empleado2.dameNombre()+
                " Sueldo: "+empleado2.dameSueldo()+
                " Fecha de Alta: "+empleado2.dameFechaContrato());
         
          System.out.println("Nombre :"+empleado3.dameNombre()+
                " Sueldo: "+empleado3.dameSueldo()+
                " Fecha de Alta: "+empleado3.dameFechaContrato());*/
    }
    
}


class Empleado
{
    public Empleado(String nom, double sue,int agno,int mes,int dia)
    {
        nombre=nom;
        sueldo=sue;
        GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
        altaContrato=calendario.getTime();
    }
    
    public Empleado(String nom)
    {
       this(nom,30000,2000,01,01);
    }
    
    public String dameNombre()
    {
        return nombre;
    }
    
    public double dameSueldo()
    {
        return sueldo;
    }
    
    public Date dameFechaContrato()
    {
        return altaContrato;
    }
    
    public void subeSueldo(double porcentaje)
    {
        double aumento=sueldo*porcentaje/100;
        sueldo+=aumento;
    }
    
    private String nombre; //private por la encapsulacion
    private double sueldo;
    private Date altaContrato;
    
}