package equivalentehora;


public class EquivalenteHora {
    
    private float horas;
    private float minutos;
    private float segundos;
    private float dias;
    
    public void establecerHoras(float x){
        horas = x;
    }
    
    public void calcularMinutos(){
        minutos = horas * 60;
    }
    
    public void calcularSegundos(){
        segundos = horas * 3600;
    }
    
    public void calcularDias(){
        dias = horas / 24;
    }
     
    public double obtenerHoras(){
        return horas;
    }
    
    public double obtenerCalcularMinutos(){
        return minutos;
    }
    
    public double obtenerCalcularSegundos(){
        return segundos;
    }
    
    public double obtenerCalcularDias(){
        return dias;
    }
}