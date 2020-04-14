
package natureza.mamifero;

public class Cachorro extends Mamifero{
    
    // METODO DE SOBREPOSIÇÃO    
    @Override
    public void emitirSom() {
        System.out.println("Au au au");
    }
    
    // METODO DE SOBRECARGA
    // Metódo reação - frase:
    public void reacao(String frase){
        if(frase.equals("Toma comida") || frase.equals("ola")){
            System.out.println("Abanar e latir");
        }else {
            System.out.println("Rosnar");
        }
    }
    
    // Método reação - hora/minuto:
    public void reacao(int hora, int min){
        if(hora < 12){
            System.out.println("Abanar o rabo");
        }
        else if(hora >= 18){
            System.out.println("Ignorar");
        } 
        else{
            System.out.println("Abanar e latir");
        }
    }
    
    // Método reação - dono:
    public void reacao(boolean dono){
        if(dono == true){
            System.out.println("Abanar");
        } else{
            System.out.println("Rosnar e latir");
            emitirSom();
        }
    }
    
    // Método reação - idade/peso:
    public void reacao(int idade, float peso){
        if(idade < 5){
            if(peso < 10){
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        }else {
            if(peso < 10){
                System.out.println("Rosnar");
            }else{
                System.out.println("Ignorar");
            }
        }
    }
}
