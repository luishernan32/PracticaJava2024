/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author luis
 */
public class Coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    String color;
    String color_bomper;
    int peso_total;
    boolean asientos_cuero, climatizador;
    
    public Coche()
    {
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        peso_plataforma=500;
        //color="red";
    }
    
    /*public void setRuedas(int ruedas)
    {
        this.ruedas=ruedas;
    }
    
    public int getRuedas()
    {
        return ruedas;
    }*/
    
    public String getDatosGenerales()
    {
        return " "+ruedas +"\n"
                  +largo +"\n"
                  +ancho +"\n"
                  +motor +"\n";
    }   
    
    public String dimeLargo()
    {
        return "El largo del coche es "+largo;
    }
    
    public void setColor()
    {
        color="azul";
    }
    
    public String getColor()
    {
        return "El color del coche es: " +color;
    }
    
    public void setColorBomper(String colorBomper)
    {
        color_bomper=colorBomper;
    }
    
    public String getColorBomper()
    {
        return color_bomper;
    }
    
    public void setAsientosCuero(String asientos_cuero)
    {
       if(asientos_cuero=="si")
       {
           this.asientos_cuero=true;
       }
       else
       {
           this.asientos_cuero=false;
       }
    }
    
    public String getAsientosCuero()
    {
        if(asientos_cuero==true)
        {
            return "El coche tiene asientos de cuero";
        }
        else
        {
            return "El coche no tiene asientos de cuero";
        }
    }
}
