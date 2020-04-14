
package natureza;

import natureza.ave.Arara;
import natureza.ave.Ave;
import natureza.mamifero.Cachorro;
import natureza.mamifero.Canguru;
import natureza.mamifero.Mamifero;
import natureza.peixe.GoldFish;
import natureza.peixe.Peixe;
import natureza.reptil.Cobra;
import natureza.reptil.Reptil;
import natureza.reptil.Tartaruga;

public class Main {

    public static void main(String[] args) {
       // Animal a = new Animal();
       Ave av = new Ave(); 
       Mamifero m = new Mamifero();
       Peixe p = new Peixe();
       Reptil r = new Reptil();
       
       Canguru c = new Canguru(); 
       Cachorro ca = new Cachorro();
       Cobra co = new Cobra();
       Tartaruga ta = new Tartaruga();
       GoldFish go = new GoldFish();
       Arara ar = new Arara();
       
       ca.reacao(true);
       ca.reacao(false);
    }  
}
