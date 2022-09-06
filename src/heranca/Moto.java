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
public class Moto extends Terrestre{
    
        
    private String numplaca;
    private int numAcentos;
    
    
    public void imprimeDadosMoto(){
        
        System.out.println("----------MOTO--------");
        System.out.println("Placa: " + numplaca);
        System.out.println("Numero de Porta: " + numAcentos);
        System.out.println("Numero de Rodas: " + numRodas);  
        System.out.println("Capacidade: " + capacidade);
    }
    
    

    public String getNumplaca() {
        return numplaca;
    }

    public void setNumplaca(String numplaca) {
        this.numplaca = numplaca;
    }

    public int getNumAcentos() {
        return numAcentos;
    }

    public void setNumAcentos(int numAcentos) {
        this.numAcentos = numAcentos;
    }
    
    
}
