
package natureza.peixe;

import natureza.animal.Animal;

public class Peixe extends Animal{
    
    // Atributos:
    private String corEscama;
    
    // Gets e Sets:
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
       
    //--------------------------------------------------------------------------
    
    // Métodos:
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    
    public void soltarBolha(){
        System.out.println("Soltando bolha");
    }
}
