/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroluis;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public abstract class Operaciones {
    private static int saldo;
    protected int deposito, retiro, transaccion;
    Scanner entrada=new Scanner(System.in);
    
    public void Operar()
    {
        int seleccionar;
        int bandera=0;
        do
        {
            do
            {
                System.out.println("Bienvenido al menú de opciones");
                System.out.println("1. Para consultar tu saldo");
                System.out.println("2. Para retirar tu saldo");
                System.out.println("3. Para depositar tu saldo");
                System.out.println("4. Para salir");
                seleccionar=entrada.nextInt();
                if(seleccionar>0&&seleccionar<=4)
                {
                    bandera=1;
                }
                else
                {
                    System.out.println("Ingresa una opción valida");
                }
                
            }while(bandera==0);
            if(seleccionar==1)
            {
                Operaciones objeto=new Consultar();
                objeto.Transacciones();
            }
            else if(seleccionar==2)
            {
                Operaciones objeto=new Retirar();
                    objeto.Transacciones();
            }
            else if(seleccionar==3)
            {
                Operaciones objeto=new Depositar();
                    objeto.Transacciones();
            }
            else if(seleccionar==4)
            {
                bandera=2;
            }
        }while(bandera!=2);
    }
    
    public void Retirar()
    {
        System.out.println("**************************************");
        System.out.println("Ingresa la cantidad que deseas Retirar");
        System.out.println("**************************************");
        retiro=entrada.nextInt();
    }
    
    public void Depositar()
    {
        System.out.println("**************************************");
        System.out.println("Ingresa la cantidad que deseas Depositar");
        System.out.println("**************************************");
        //deposito=entrada.nextInt();
    }
    
    public abstract void Transacciones();
    
    public void setSaldo(int saldo)
    {
        this.saldo=saldo;
    }
    public int getSaldo()
    {
        return saldo;
    }
    
    public void imprimir()
    {
        System.out.println("*********************************");
        System.out.println("Tu saldo actual es de "+getSaldo());
        System.out.println("*********************************");
    }
    
}
