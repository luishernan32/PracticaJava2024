/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroluis;

/**
 *
 * @author luis
 */
public class CorreosAutomaticos {
    public static void main(String[] args) {
        String frase="luishernan22@gmail.com";
        String frase_resumen=frase.substring(1, 6);
        String frase_resumen_II=frase.substring(0,29)+"Irnos a la playa y olvidarnos de todo"
                +" y "+ frase.substring(29,57);
        
        System.out.println(frase);
    }
    
}


class Incremento{
    
    public Incremento(String nom)
    {
        nombre=nom;
        seccion="Administracion";
        id=idSiguiente;
        idSiguiente++;
    }
    
    public void cambiaSeccion(String seccion)
    {
        this.seccion=seccion;
    }
    
    public String devuelveDatos()
    {
        return "El nombre es: "+nombre+"y la seccion es: "+seccion+"El Id del trabajor es: "+id;
    }
    
    public String incrementaCorreo()
    {
        return ""+id;
    }
    
    public void cambioNombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    private String nombre;
    private String seccion;
    private int id;
    private static int idSiguiente=1;
}
