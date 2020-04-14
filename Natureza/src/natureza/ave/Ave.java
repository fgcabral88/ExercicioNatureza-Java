
package natureza.ave;

import natureza.animal.Animal;

public class Ave extends Animal {

    // Atributos:
    private String corPena;
    
    // Gets e Sets:
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    //--------------------------------------------------------------------------
    
    // Métodos:
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    
    public void fazerNinho(){
        System.out.println("Construindo ninho");
    }
}
