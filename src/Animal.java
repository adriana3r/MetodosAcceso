//Métodos accesores GET y SET en Java.


public class Animal {
    
    private String especie;
    private String nombre;
    private String raza;
    private int edad;
    private double peso;
    
    
public void setespecie(String especieingresada){
        
        especie = especieingresada;
            
    }

public String getespecie(){
        
        return especie;
        
    }

public void setnombre(String nombreingresado){
        
        nombre = nombreingresado;
            
    }

public String getnombre(){
        
        return nombre;
        
    }

public void setraza(String razaingresada){
        
        raza = razaingresada;
            
    }

public String getraza(){
        
        return raza;
        
    }    

public void setedad(int edadingresada){
        
        edad = edadingresada;
            
    }

public int getedad(){
        
        return edad;
        
    }

public void setpeso(double pesoingresado){
        
        peso = pesoingresado;
            
    } 

public double getpeso(){
        
        return peso;
        
    }    
    
}

