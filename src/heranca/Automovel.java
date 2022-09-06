/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author Cliente
 */
public class Automovel extends Terrestre{
    
    private String numplaca;
    private int numPorta;
    
    public void ImprimeDadosCarro(){
        
        
        System.out.println("----------CARRO--------");
        System.out.println("Placa: " + numplaca);
        System.out.println("Numero de Porta: " + numPorta);
        System.out.println("Numero de Rodas: " + numRodas);  
        System.out.println("Capacidade: " + capacidade);
        
        
    }
    

    public String getNumplaca() {
        return numplaca;
    }

    public void setNumplaca(String numplaca) {
        this.numplaca = numplaca;
    }

    public int getNumPorta() {
        return numPorta;
    }

    public void setNumPorta(int numPorta) {
        this.numPorta = numPorta;
    }
    
    
    
}
