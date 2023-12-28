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
public class Depositar extends Operaciones{
    @Override
    public void Transacciones()
    {
        Depositar();
        transaccion=getSaldo();
        setSaldo(transaccion+deposito);
        System.out.println("La cantidad que depositaste fue de: "+deposito);
        imprimir();
    }
    
}
