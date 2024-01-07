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
public class Furgoneta extends Coche{
    
    private int capacidad_carga;
    private int plazas_extra;
    
    public Furgoneta(int plazas_extra, int capacidad_carga)
    {
        super(); //Para llamar al constructor de la clase padre
        this.capacidad_carga=capacidad_carga;
        this.plazas_extra=plazas_extra;
    }
    
    public String dimeDatosFurgoneta()
    {
        return"La capacidad de carga es: "+capacidad_carga+" Y las plazas son: "+plazas_extra;
    }
    
}
