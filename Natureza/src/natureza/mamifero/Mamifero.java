
package natureza.mamifero;

import natureza.animal.Animal;

public class Mamifero extends Animal{

    // Atributos:
    private String corPelo;
    
    // Gets e Sets:
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    //--------------------------------------------------------------------------
    
    // Métodos:
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
    
}
