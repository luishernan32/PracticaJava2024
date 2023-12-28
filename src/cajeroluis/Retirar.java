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
public class Retirar extends Operaciones{
    @Override
    public void Transacciones()
    {
        Retirar();
        transaccion=getSaldo();
        if(retiro<=transaccion)
        {
            setSaldo(transaccion-retiro);
            System.out.println("La cantidad que retiraste fue de: "+retiro);
            imprimir();
        }
        else
        {
            System.out.println("Eres pobre no tienes suficiente dinero");
        }
    }
    
}
