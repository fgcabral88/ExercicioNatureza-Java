
package natureza.animal;

public abstract class Animal {
    
    // Atributos:
    protected float peso;
    protected int idade;
    protected int membros;
    
    // Gets e Sets:
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    
    //--------------------------------------------------------------------------
    
    // Método locomover:
    public abstract void locomover();

    // Método alimentar:
    public abstract void alimentar();
    
    // Método emitir som:
    public abstract void emitirSom();
    
}
