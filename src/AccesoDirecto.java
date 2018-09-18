//Métodos accesores GET y SET en Java.

public class AccesoDirecto {
    public static void main(String[] args){
        
        Animal a1 = new Animal();
        a1.setespecie("Canino");
        a1.setnombre("Muna");
        a1.setraza("Mestizo");
        a1.setedad(13);
        a1.setpeso(35.25);
        
        
        System.out.println(("Especie: ") + (a1.getespecie()));
        System.out.println(("Nombre: ") + (a1.getnombre()));
        System.out.println(("Raza: ") + (a1.getraza()));
        System.out.println(("Edad: ") + (a1.getedad()));
        System.out.println(("Peso: ") + (a1.getpeso()) + ( " kilogramos"));
        
    }
    
}
    

