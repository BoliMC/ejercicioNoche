/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manzanas;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author core
 */
public class Manzanas {

    final double precio=4200;
    private int numKilo;
    private double totalApagar;

    public Manzanas(int pesoKilos) {
        this.numKilo = pesoKilos;
       
    }

    public double getPrecio() {
        return precio;
    }

    public int getPesoKilos() {
        return numKilo;
    }

    public double getTotalApagar() {
        return totalApagar;
    }
    
    /**
     * @param args the command line arguments
     */
    public double calcularTotal (int numKilo){
    double valor1;
    if (numKilo>0 && numKilo<=2){
    totalApagar=precio*numKilo;
    } else if (numKilo>2 && numKilo<=5){
    valor1=(precio*numKilo)*10/100;
    totalApagar=precio*numKilo-valor1;
    } else if (numKilo>5 && numKilo<=10){
    valor1=(precio*numKilo)*15/100;
    totalApagar=precio*numKilo-valor1;
    } else{
    
    valor1=(precio*numKilo)*20/100;
    totalApagar=precio+numKilo-valor1;
    }
    return totalApagar;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    String numString= JOptionPane.showInputDialog("Ingresar Kilos:");
    int numint=Integer.parseInt(numString);

    Manzanas cliente= new Manzanas(numint);
    JOptionPane.sho(Null,"La compra de"+numInt+ "Kilos tiene un valor de:"+cliente.precio*cliente.numKilo
    + "Pero usted tiene un descuento por valor de:"+ cliente.valor1;
    + "porlo tanto usted debe pagar"+ cliente.calcularTotal(numInt));

