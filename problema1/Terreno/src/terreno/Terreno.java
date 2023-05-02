package terreno;


public class Terreno {
    
    private double costoTerreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    
    
    public void estableceRancho(double x){
        ancho = x;
    }
    
    public void establecerLargo(double x){
        largo = x;
    }
    
    public void establecerValorMetroCuadrado(double x){
        valorMetroCuadrado = x;
    }
    
    public void calcularArea(){
        area = largo * ancho;
    }

    public void calcularCostoTerreno(){
        costoTerreno = valorMetroCuadrado * area;
    }
    
    public double obteneRancho(){
        return ancho;
    }
    
    public double obtenerLargo(){
        return largo;
    }
    
    public double obtenerValorMetroCuadrado(){
        return valorMetroCuadrado;
    }
    
    public double obtenerCalcularArea(){
        return area;
    }
    
    public double obtenerCalcularCostoTerreno(){
        return costoTerreno;
    }
}
